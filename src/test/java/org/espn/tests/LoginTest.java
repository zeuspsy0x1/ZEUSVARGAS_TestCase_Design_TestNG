package org.espn.tests;

import org.espn.pages.WatchPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;

public class LoginTest extends BaseForAllTests{

    @Test(dataProvider = "userLoginData")
    public void LoginValidations(String email, String password, String username) throws InterruptedException {
        homePage.hoverProfileIcon();
        homePage.clickOnLoginButton();
        homePage.enterLoginOrUpdateAccountIframe();
        checkThat("Login modal iFrame is present", homePage.isLoginIframePresent(), is(true));
        checkThat("Login ESPN logo is displayed", homePage.isEspnLogoDisplayedInLoginModal(), is(true));
        checkThat("Login button is displayed", homePage.isLoginButtonDisplayedInLoginModal(), is(true));
        checkThat("Signup button is displayed", homePage.isSignUpButtonDisplayedInLoginModal(), is(true));
        homePage.typeEmailAndPasswordOnLoginInputs(email, password);
        homePage.clickSubmitButton();
        homePage.moveOutOfTheIframe();
    }
    @Test(dataProvider = "userLoginData")
    public void WatchPageAndGreetingsValidations(String email, String password, String username) throws InterruptedException {
        WatchPage watchPage = homePage.navigateFromHomePageToWatchPage();
        checkThat("At least 1 carousel is present", watchPage.isAtLeastOneCarouselDisplayed(), is(true));
        checkThat("All cards in carousel number 2 have title", watchPage.checkTitleInAllCardsInTheCarouselTwo(), is(false));
        checkThat("All cards in carousel number 2 have description", watchPage.checkDescriptionInAllCardsInTheCarouselTwo(), is(false));
        watchPage.clickOnCardNumberTwoInCarouselTwo();
        checkThat("X close button is displayed", watchPage.isSecondCardXButtonDisplayed(), is(true) );
        watchPage.clickXButtonToCloseModal();
        watchPage.navigateToPreviousPage();
        homePage.hoverProfileIcon();
        checkThat("Name is displayed in greetings", homePage.focusedGreetingsText(), is("Welcome" + username + "!"));
        homePage.hoverProfileIcon();
        homePage.clickLogoutButton();
        homePage.hoverProfileIcon();
        checkThat("Name is displayed in greetings", homePage.generalGreetingsText(), is("Welcome!"));
    }
}
