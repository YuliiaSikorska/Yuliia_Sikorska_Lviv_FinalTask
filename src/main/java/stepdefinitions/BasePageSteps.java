package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import manager.PageFactoryManager;

public class BasePageSteps {
    PageFactoryManager pageFactoryManager;

    public BasePageSteps() {
        pageFactoryManager = new PageFactoryManager();
    }

    public static final long DEFAULT_TIMEOUT = 30;
    public static final String HREF_ATTRIBUTE = "href";
    public static final String ARIA_LABEL_ATTRIBUTE = "aria-label";
    public static final String BASE_PAGE = "https://www.asos.com/";

    @Before
    public void testsSetUp() {
        pageFactoryManager.getDriver().get(BASE_PAGE);
    }

    @After
    public void tearDown() {
        pageFactoryManager.close();
    }
}