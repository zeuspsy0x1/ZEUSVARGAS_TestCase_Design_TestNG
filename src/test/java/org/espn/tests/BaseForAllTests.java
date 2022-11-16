package org.espn.tests;

import org.espn.configuration.Driver;
import org.espn.pages.HomePage;
import org.espn.reporting.Reporter;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import static java.lang.String.format;

public class BaseForAllTests {

    private Driver driver;
    protected HomePage homePage;


    @DataProvider(name = "userLoginData")
    public Object[][] getUserData() {
        //                        email                  password     username
        //return new Object[][]{{"zeusvargas@gmail.com", "123321123", "zeus"}};
        return new Object[][]{{"x6@x6.com", "x6@x6.com.", "zeus"}};
    }


    @Parameters({"browser", "url"})
    @BeforeClass
    public void testSetUp(String browser, String url) {
            driver = new Driver(browser);
        Reporter.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info("Navigating to " + url);
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        homePage = new HomePage(driver.getDriver());
    }
    protected void loginFunctionalityAtOnce( String email, String password) throws InterruptedException {
        HomePage homePage = new HomePage(driver.getDriver()) ;
        homePage.hoverProfileIcon();
        homePage.clickOnLoginButton();
        homePage.enterLoginOrUpdateAccountIframe();
        homePage.typeEmailAndPasswordOnLoginInputs(email, password);
        homePage.clickSubmitButton();
        homePage.moveOutOfTheIframe();
    }
    protected void loginWithADeactivatedAccount( String email, String password) throws InterruptedException {
        HomePage homePage = new HomePage(driver.getDriver()) ;
        homePage.hoverProfileIcon();
        homePage.clickOnLoginButton();
        homePage.enterLoginOrUpdateAccountIframe();
        homePage.typeEmailAndPasswordOnLoginInputs(email, password);
        homePage.clickSubmitButton();
    }
    public void scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver.getDriver();
         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //js.executeScript("window.scrollBy(0,350)", "");
    }

    //Assertions
    protected <T> void checkThat(String description, T actualValue, Matcher<? super T> expectedValue) {
        Reporter.info(format("Checking that " + description.toLowerCase() + "[Expectation: %s]", expectedValue));
        try {
            MatcherAssert.assertThat(actualValue, expectedValue);
        } catch (AssertionError e) {
            Reporter.error(format("Assertion Error: [%s]", e.getMessage().replaceAll("\n", "")));
        }
    }

    @AfterClass
    public void tearDown() {
        driver.getDriver().quit();
    }
}
