package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

import static stepdefinitions.BasePageSteps.HREF_ATTRIBUTE;

public class BagPage extends BasePage {

    @FindBy(xpath = "//h2[@class='empty-bag-title']")
    private WebElement emptyBagText;

    @FindBy(xpath = "//li[@class='bag-item-holder']")
    private List<WebElement> productLineItem;

    @FindBy(xpath = "//div[@class='empty-bag-contents-holder']")
    private WebElement emptyBagContents;

    By itemName = By.xpath("//p[@class='bag-item-name']//a");

    public void openBagPage(String urlBagPage) {
        driver.get(urlBagPage);
    }

    public String getEmptyBagText() {
        return emptyBagText.getText();
    }

    public List<WebElement> getProductLineItems() {
        return productLineItem;
    }

    public List<String> getProductLineItemsName() {
        return getProductLineItems().stream()
                .map(it -> it.findElement(itemName).getAttribute(HREF_ATTRIBUTE))
                .collect(Collectors.toList());
    }

    public WebElement getEmptyBagContents() {
        return emptyBagContents;
    }

    public By getItemNameLocator() {
        return itemName;
    }
}