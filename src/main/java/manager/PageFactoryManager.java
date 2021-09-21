package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class PageFactoryManager {
    private static WebDriver driver;

    public WebDriver getDriver() {
        if (driver != null && isDriverAlive()) {
            return driver;
        } else return createWebDriver();
    }

    public WebDriver createWebDriver() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public boolean isDriverAlive() {
        try {
            driver.manage().window().getSize();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void close() {
        getDriver().close();
    }
}