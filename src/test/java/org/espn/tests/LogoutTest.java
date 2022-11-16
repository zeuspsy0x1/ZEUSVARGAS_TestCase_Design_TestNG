package org.espn.tests;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;

public class LogoutTest extends BaseForAllTests {

    @Test(dataProvider = "userLoginData")
    public void LogoutValidations(String email, String password, String username) throws InterruptedException {
        super.loginFunctionalityAtOnce(email, password);
        homePage.hoverProfileIcon();
        homePage.clickLogoutButton();
        homePage.hoverProfileIcon();
        checkThat("Name is displayed in greetings", homePage.generalGreetingsText(), is("Welcome!"));
    }
}
