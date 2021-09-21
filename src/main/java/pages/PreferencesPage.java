package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreferencesPage extends BasePage {

    @FindBy(xpath = "//section[@data-testid='country-selector-form']")
    private WebElement preferencesPopup;

    @FindBy(xpath = "//select[@id='country']")
    private WebElement countryDropdown;

    @FindBy(xpath = "//select[@id='currency']")
    private WebElement currencyDropdown;

    public WebElement getPreferencesPopup() {
        return preferencesPopup;
    }

    public boolean isPreferencesPopupVisible() {
        return preferencesPopup.isDisplayed();
    }

    public boolean isCurrencyDropdownVisible() {
        return currencyDropdown.isDisplayed();
    }

    public boolean isCountryDropdownVisible() {
        return countryDropdown.isDisplayed();
    }
}