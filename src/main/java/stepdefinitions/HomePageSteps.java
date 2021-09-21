package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PreferencesPage;

import static org.junit.Assert.assertTrue;
import static stepdefinitions.BasePageSteps.DEFAULT_TIMEOUT;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    PreferencesPage preferencesPage = new PreferencesPage();

    @Given("User opens {string} page")
    public void openHomePage(final String url) {
        homePage.openHomePage(url);
    }

    @When("User checks header visibility")
    public void userChecksHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(homePage.isHeaderVisible());
    }

    @And("User checks footer visibility")
    public void userChecksFooterVisibility() {
        assertTrue(homePage.isFooterVisible());
    }

    @And("User checks search field visibility")
    public void userChecksSearchFieldVisibility() {
        assertTrue(homePage.isSearchFieldVisible());
    }

    @And("User checks My account icon visibility")
    public void userChecksMyAccountIconVisibility() {
        assertTrue(homePage.isMyAccountIconVisible());
    }

    @When("User clicks My account icon in header")
    public void userClicksMyAccountIconInHeader() {
        homePage.clickMyAccountIcon();
    }

    @And("User checks that My account popup is visible")
    public void userChecksThatMyAccountPopupIsVisible() {
        assertTrue(homePage.isMyAccountPopupVisible());
    }

    @And("User checks Saved items icon visibility")
    public void userChecksSavedItemsIconVisibility() {
        assertTrue(homePage.isSavedItemsIconVisible());
    }

    @And("User checks Bag icon visibility")
    public void userChecksBagIconVisibility() {
        assertTrue(homePage.isBagIconVisible());
    }

    @And("User checks Preferences button visibility")
    public void userChecksPreferencesButtonVisibility() {
        assertTrue(homePage.isPreferencesIconVisible());
    }

    @And("User clicks Preferences button")
    public void userClicksPreferencesButton() {
        homePage.clickPreferencesIcon();
    }

    @Then("User checks that Preferences popup is visible")
    public void userChecksThatPreferencesPopupIsVisible() {
        preferencesPage.waitVisibilityOfElement(30, preferencesPage.getPreferencesPopup());
        assertTrue(preferencesPage.isPreferencesPopupVisible());
    }

    @And("User checks that country dropdown is visible on Preferences popup")
    public void userChecksThatCountryDropdownIsVisible() {
        assertTrue(preferencesPage.isCountryDropdownVisible());
    }

    @Then("User checks that currency dropdown is visible on Preferences popup")
    public void userChecksThatCurrencyDropdownIsVisible() {
        assertTrue(preferencesPage.isCurrencyDropdownVisible());
    }

    @Then("User clicks logo icon")
    public void userClicksLogoIcon() {
        homePage.waitForAjaxToComplete(30);
        homePage.clickLogoAsos();
    }
}