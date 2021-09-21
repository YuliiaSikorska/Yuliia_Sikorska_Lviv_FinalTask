package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

import static stepdefinitions.BasePageSteps.HREF_ATTRIBUTE;

public class SavedListPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'customerItemsProductTile')]//a")
    private List<WebElement> savedItems;

    @FindBy(xpath = "//select[@aria-label='Size']")
    private WebElement colorSizeButton;

    @FindBy(xpath = "(//select[@aria-label='Size']//option)[2]")
    private WebElement selectColorSize;

    @FindBy(xpath = "(//button[contains(@class,'toBagButton')])[1]")
    private WebElement moveToBagButton;

    By savedItemHeader = By.xpath("//h1[contains(@class,'header')]");

    By noSavedItems = By.xpath("//div[contains(@class,'noItems')]");

    public void clickColorSizeButton() {
        colorSizeButton.click();
    }

    public void selectColorSize() {
        selectColorSize.click();
    }

    public void clickMoveToBagButton() {
        moveToBagButton.click();
    }

    public List<WebElement> getSavedItems() {
        return savedItems;
    }

    public By getSavedItemHeader(){
        return savedItemHeader;
    }

    public By getNoSavedItems(){
        return noSavedItems;
    }

    public List<String> getProductLineItemsName(){
        return getSavedItems().stream()
                .map(it -> it.getAttribute(HREF_ATTRIBUTE))
                .collect(Collectors.toList());
    }
}