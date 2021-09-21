package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//article[@data-auto-id='productTile']//a")
    private List<WebElement> listOfProduct;

    public List<WebElement> getListOfProduct(){
        return listOfProduct;
    }
}