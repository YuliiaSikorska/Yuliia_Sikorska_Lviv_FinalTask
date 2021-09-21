package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='chrome-header']")
    private WebElement header;

    @FindBy(xpath = "//div[@id='chrome-footer']")
    private WebElement footer;

    @FindBy(xpath = "//input[@id='chrome-search']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@id='myAccountDropdown']")
    private WebElement myAccountIcon;

    @FindBy(xpath = "//div[@data-testid='myaccount-dropdown']")
    private WebElement myAccountPopup;

    @FindBy(xpath = "//a[@data-testid='savedItemsIcon']")
    private WebElement savedItemsIcon;

    @FindBy(xpath = "//a[@data-testid='miniBagIcon']")
    private WebElement bagIcon;

    @FindBy(xpath = "//li//button[@data-testid='country-selector-btn']")
    private WebElement preferencesIcon;

    @FindBy(xpath = "//button[@data-testid='search-button-inline']")
    private WebElement searchButton;

    @FindBy(xpath = "//img[@alt='ASOS']")
    private WebElement logoAsos;

    public void openHomePage(String urlHomePage) {
        driver.get(urlHomePage);
    }

    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isFooterVisible() {
        return footer.isDisplayed();
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.sendKeys(searchText);
    }

    public boolean isMyAccountIconVisible() {
        return myAccountIcon.isDisplayed();
    }

    public void clickMyAccountIcon() {
        myAccountIcon.click();
    }

    public boolean isMyAccountPopupVisible() {
        return myAccountPopup.isDisplayed();
    }

    public boolean isSavedItemsIconVisible() {
        return savedItemsIcon.isDisplayed();
    }

    public void clickSavedIcon() {
        savedItemsIcon.click();
    }

    public boolean isBagIconVisible() {
        return bagIcon.isDisplayed();
    }

    public void clickBagIcon() {
        bagIcon.click();
    }

    public boolean isPreferencesIconVisible() {
        return preferencesIcon.isDisplayed();
    }

    public void clickPreferencesIcon() {
        preferencesIcon.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickLogoAsos(){
        logoAsos.click();
    }
}