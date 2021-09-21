package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BagPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BagPageSteps {
    BagPage bagPage = new BagPage();
    HomePage homePage = new HomePage();

    @Given("User open Bag page {string}")
    public void openBagPage(final String url) {
        bagPage.openBagPage(url);
    }

    @When("User click Bag icon in header")
    public void userClickBagIconInHeader() {
        homePage.clickBagIcon();
    }

    @And("User checks empty that bag title is {string}")
    public void userChecksThatBagTitleIsEmptyTitle(String bagEmpty) {
        bagPage.waitVisibilityOfElement(30, bagPage.getEmptyBagContents());
        assertEquals(bagPage.getEmptyBagText(), bagEmpty);
    }

    @Then("User checks that product bag contains product {string}")
    public void userChecksThatProductBagContainsProductProductId(String productId) {
        bagPage.waitVisibilityOfElementLocated(30,bagPage.getItemNameLocator());
        assertTrue(bagPage.getProductLineItemsName().stream()
                .anyMatch(it -> it.contains(productId)));
    }
}
