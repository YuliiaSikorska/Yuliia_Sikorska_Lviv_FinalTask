package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.SearchResultPage;

import static org.junit.Assert.assertTrue;
import static stepdefinitions.BasePageSteps.ARIA_LABEL_ATTRIBUTE;

public class SearchResultPageSteps {
    SearchResultPage searchResultPage = new SearchResultPage();

    @Then("User checks that all products name contains {string} on search result page")
    public void userChecksThatAllProductsNameContainsKeyword(String keyword) {
        searchResultPage.waitForAjaxToComplete(30);
        for (WebElement webElement : searchResultPage.getListOfProduct()) {
            assertTrue(webElement.getAttribute(ARIA_LABEL_ATTRIBUTE).contains(keyword));
        }
    }
}