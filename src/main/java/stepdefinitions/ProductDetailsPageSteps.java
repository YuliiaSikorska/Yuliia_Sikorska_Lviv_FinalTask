package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import pages.HomePage;
import pages.ProductDetailsPage;

import static org.junit.Assert.assertTrue;

public class ProductDetailsPageSteps {
    HomePage homePage = new HomePage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Given("User search for {string} via search field")
    public void userSearchForKeyword(String searchParameter) {
        homePage.enterTextToSearchField(searchParameter);
        homePage.clickSearchButton();
    }

    @When("User opens product detail page for product {string}")
    public void userOpensProductDetailPageForProduct(String productId) {
        productDetailsPage.waitForAjaxToComplete(30);
        productDetailsPage.openProductPage(productId);
    }

    @And("User selects available color-size option")
    public void userSelectsAvailableColorSizeOption() {
        productDetailsPage.clickSizeDropDown();
        productDetailsPage.selectColorSize();
    }

    @And("User clicks Add to Bag button")
    public void userClicksAddToBagButton() {
        productDetailsPage.clickAddToBagButton();
        productDetailsPage.waitForAjaxToComplete(10);
    }

    @And("User click Bag icon")
    public void userClickBagIcon() {
        homePage.clickBagIcon();
    }

    @And("User click View Bag button")
    public void userClickViewBagButton() {
        productDetailsPage.clickViewBagButton();
    }

    @And("User clicks Save button")
    public void userClicksSaveButton() {
        productDetailsPage.waitVisibilityOfElement(30,productDetailsPage.getSaveButton());
        productDetailsPage.clickSaveButton();
    }

    @Then("User checks that current url contains {string}")
    public void userChecksThatCurrentUrlContainsPdp(String pdp) {
        assertTrue(new PageFactoryManager().getDriver().getCurrentUrl().contains(pdp));
    }
}