package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailsPage extends BasePage {

    private static final String productUrl = "https://www.asos.com/prd/%s";

    @FindBy(xpath = "//select[@id='main-size-select-0']")
    private WebElement sizeDropDown;

    @FindBy(xpath = "//select[@id='main-size-select-0']//option")
    private List<WebElement> selectColorSize;

    @FindBy(xpath = "//button[@id='product-add-button']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//a[@data-test-id='bag-link']")
    private WebElement viewBagButton;

    @FindBy(xpath = "//button[@class='save-button']")
    private WebElement saveButton;

    By saveButtonActive = By.xpath("//button[@class='save-button active animate']");

    public void clickSizeDropDown() {
        sizeDropDown.click();
    }

    public void selectColorSize() {
        selectColorSize.get(3).click();
    }

    public void openProductPage(String productId) {
        driver.get(String.format(productUrl, productId));
    }

    public void clickAddToBagButton() {
        addToBagButton.click();
    }

    public void clickViewBagButton() {
        viewBagButton.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public WebElement getSaveButton(){
        return saveButton;
    }

    public By getSaveButtonActive(){
        return saveButtonActive;
    }
}