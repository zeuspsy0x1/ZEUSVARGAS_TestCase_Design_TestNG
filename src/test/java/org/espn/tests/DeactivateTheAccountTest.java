package org.espn.tests;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;

public class DeactivateAccountTest extends BaseForAllTests{

    @Test(dataProvider = "userLoginData")
    public void deactivateAccount(String email, String password, String username) throws InterruptedException {
        super.loginFunctionalityAtOnce(email, password);
        homePage.hoverProfileIcon();
        homePage.clickOnEspnProfileButton();
        homePage.enterLoginOrUpdateAccountIframe();
        super.scrollToBottom();
        homePage.clickOnDeleteAccount();
        Thread.sleep(2000);
        homePage.clickSubmitButton();
    }
}
