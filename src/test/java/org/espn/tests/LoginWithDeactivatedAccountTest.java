package org.espn.tests;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;

public class LoginWithDeactivatedAccountTest extends BaseForAllTests{

    @Test(dataProvider = "userLoginData")
    public void deactivateAccount(String email, String password, String username) throws InterruptedException {
        super.loginWithADeactivatedAccount(email, password);
        checkThat("Account Deactivated text appears", homePage.getDeactivatedAccountTextMessage(), is("Account Deactivated"));
    }
}
