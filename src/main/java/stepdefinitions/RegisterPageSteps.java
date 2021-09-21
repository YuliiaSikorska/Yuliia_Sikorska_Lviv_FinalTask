package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

import static org.junit.Assert.assertEquals;

public class RegisterPageSteps {
    RegisterPage registerPage = new RegisterPage();

    @Given("User opens register page {string}")
    public void openRegisterPage(final String url) {
        registerPage.openRegisterPage(url);
    }

    @When("User enters new random e-mail address on register page")
    public void userEntersNewRandomEMailAddressOnRegisterPage() {
        registerPage.inputRandomEmail();
    }

    @And("User enters {string} into first name field on register page")
    public void userEntersFirstNameIntoFirstNameFieldOnRegisterPage(String firstName) {
        registerPage.setFirstName(firstName);
    }

    @And("User enters {string} into last name field on register page")
    public void userEntersLastNameIntoLastNameFieldOnRegisterPage(String lastName) {
        registerPage.setLastName(lastName);
    }

    @And("User enters {string} into password field on register page")
    public void userEntersPasswordIntoPasswordFieldOnRegisterPage(String password) {
        registerPage.setPassword(password);
    }

    @And("User selects valid date of birth on register page")
    public void userSelectsValidDateOfBirthOnRegisterPage() {
        registerPage.clickBirthDayButton();
        registerPage.selectBirthDay();
        registerPage.clickBirthMonthButton();
        registerPage.selectBirthMonth();
        registerPage.clickBirthYearButton();
        registerPage.selectBirthYear();
    }

    @And("User clicks Join asos button")
    public void userClicksJoinAsosButton() {
        registerPage.clickJoinAsosRegisterButton();
    }

    @And("User enters {string} into e-mail address field on register page")
    public void userEntersEMailIntoEMailAddressFieldOnRegisterPage(String email) {
        registerPage.inputUserEmail(email);
    }

    @And("User enters first name {string} into first name field on register page")
    public void userEntersFirstNameFirstNameIntoFirstNameFieldOnRegisterPage(String firstName) {
        registerPage.setFirstName(firstName);
    }

    @And("User enters last name {string} on register page")
    public void userEntersLastNameLastNameOnRegisterPage(String lastName) {
        registerPage.setLastName(lastName);
    }

    @And("User enters password {string} on register page")
    public void userEntersPasswordPasswordOnRegisterPage(String password) {
        registerPage.setPassword(password);
    }

    @Then("Error message {string} is displayed under email address field")
    public void errorMessageMessageIsDisplayedUnderEmailAddressField(String errorMessage) {
        registerPage.waitForAjaxToComplete(30);
        assertEquals(registerPage.getErrorValidationMessage(), errorMessage);
    }
}