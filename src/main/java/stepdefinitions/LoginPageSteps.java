package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginPageSteps  {
    LoginPage loginPage = new LoginPage();

    @Given("User opens login {string} page")
    public void userOpensLoginPage(final String url) {
        loginPage.openLoginPage(url);
    }

    @When("User enters email {string} on sign in page")
    public void userEntersEMailAddressOnSignInPage(String email) {
        loginPage.inputEmail(email);
    }

    @And("User enters password {string} on sign in page")
    public void userEntersPasswordOnSignInPage(String password) {
        loginPage.inputPassword(password);
    }

    @And("User clicks Sign in button")
    public void userClicksSignInButton() {
        loginPage.clickSignInButton();
    }

    @And("User checks that {string} is opened on login page")
    public void userChecksThatMyAccountPageIsOpenedOnLoginPage(String myAccount) {
        loginPage.waitForPageLoadComplete(30);
        assertTrue(new PageFactoryManager().getDriver().getCurrentUrl().contains(myAccount));
    }

    @Then("User logs in with email {string} and password {string}")
    public void userLogsInWithEmailEMailAndPasswordPassword(String email, String password) {
        userEntersEMailAddressOnSignInPage(email);
        userEntersPasswordOnSignInPage(password);
        userClicksSignInButton();
    }
}