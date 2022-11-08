package org.globant;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EspnDeactivateAccountTestCases {

    @BeforeClass
    public void openBrowser(){
        System.out.println();
        System.out.println("Open browser and redirect to https://www.espnqa.com/?_adbock=true&src=com");
    }


    @Test (priority = 3)
    public void deactivateAccount (){
        System.out.println();
        System.out.println("****************  Deactivate account  ****************");
        System.out.println("Hover on person icon in the top right");
        System.out.println("Hover on log in option");
        System.out.println("Click on log in option");
        System.out.println("Hover on email input");
        System.out.println("Click on email input");
        System.out.println("Write email");
        System.out.println("Hover on password input");
        System.out.println("Click on password input");
        System.out.println("Write password");
        System.out.println("Hover on log in button");
        System.out.println("Click on log in button");
        System.out.println("Validate user account access, it should be true");

        System.out.println("Hover on person icon in the top right");
        System.out.println("Hover on ESPN profile option");
        System.out.println("Click ESPN profile button");
        System.out.println("Scroll until delete account button appears");
        System.out.println("Hover on delete account option");
        System.out.println("Click on delete account button");
        System.out.println("Hover on Yes, delete this account button");
        System.out.println("Click on Yes, delete this account button");
        System.out.println("Hover on OK button");
        System.out.println("Click on OK button");
        System.out.println("Validate user account access, it should be false");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println();
        System.out.println("Close browser");
    }
}