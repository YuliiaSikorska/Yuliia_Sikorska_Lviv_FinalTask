package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UserUtil;

import java.util.List;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//select[@id='BirthDay']//option")
    private List<WebElement> birthDayList;

    @FindBy(xpath = "//select[@id='BirthMonth']//option")
    private List<WebElement> birthMonthList;

    @FindBy(xpath = "//select[@id='BirthYear']//option")
    private List<WebElement> birthYearList;

    @FindBy(xpath = "//select[@id='BirthDay']")
    private WebElement birthDayField;

    @FindBy(xpath = "//select[@id='BirthMonth']")
    private WebElement birthMonthField;

    @FindBy(xpath = "//select[@id='BirthYear']")
    private WebElement birthYearField;

    @FindBy(xpath = "//input[@id='register']")
    private WebElement joinAsosRegisterButton;

    @FindBy(xpath = "//label[@id='EmailLabel']//..//span[contains(@class,'field-validation-error')]")
    private WebElement emailFieldErrorValidationMessage;

    public void openRegisterPage(String urlRegisterPage) {
        driver.get(urlRegisterPage);
    }

    public void inputRandomEmail() {
        emailField.sendKeys(UserUtil.getRandomUserEmail(15));
    }

    public void inputUserEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void setFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void clickBirthDayButton() {
        birthDayField.click();
    }

    public void clickBirthMonthButton() {
        birthMonthField.click();
    }

    public void clickBirthYearButton() {
        birthYearField.click();
    }

    public void selectBirthDay() {
        birthDayList.get(1).click();
    }

    public void selectBirthMonth() {
        birthMonthList.get(1).click();
    }

    public void selectBirthYear() {
        birthYearList.get(1).click();
    }

    public void clickJoinAsosRegisterButton() {
        joinAsosRegisterButton.click();
    }

    public String getErrorValidationMessage() {
        return emailFieldErrorValidationMessage.getText();
    }
}