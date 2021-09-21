package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SavedListPage;

import static org.junit.Assert.assertTrue;
public class SavedListPageSteps {
    HomePage homePage = new HomePage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    SavedListPage savedListPage = new SavedListPage();

    @And("User clicks Saved item icon in header")
    public void userClicksSavedItemIconInHeader() {
        productDetailsPage.waitVisibilityOfElementLocated(30,productDetailsPage.getSaveButtonActive());
        homePage.clickSavedIcon();
    }

    @And("Saved items contain product {string}")
    public void savedItemsContainProductProductId(String productId) {
        savedListPage.waitVisibilityOfElementLocated(30,savedListPage.getSavedItemHeader());
        assertTrue(savedListPage.getProductLineItemsName().stream()
                .anyMatch(it -> it.contains(productId)));
    }

    @And("User select size option for first product on saved items page")
    public void userSelectSizeOptionForProductOnSavedItemsPage() {
        savedListPage.waitForPageLoadComplete(30);
        savedListPage.clickColorSizeButton();
        savedListPage.selectColorSize();
    }

    @Then("User clicks Move to bag button for first product on saved items page")
    public void userClicksMoveToBagButtonForProductOnSavedItemsPage() {
        savedListPage.clickMoveToBagButton();
        savedListPage.waitVisibilityOfElementLocated(30,savedListPage.getNoSavedItems());
    }
}