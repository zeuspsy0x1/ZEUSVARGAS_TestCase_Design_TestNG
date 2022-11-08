package org.globant;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EspnLogInTestCases {


    @BeforeClass
    public void openBrowser(){
        System.out.println();
        System.out.println("Open browser and redirect to https://www.espnqa.com/?_adbock=true&src=com");
    }

    @Test (priority = 1)
    public void logInWithEmailAndPassword (){
        System.out.println();
        System.out.println("****************  Log in  ****************");
        System.out.println("Hover on person icon in the top right");
        System.out.println("Hover on log in option");
        System.out.println("Click on log in button");
        System.out.println("Hover on email input");
        System.out.println("Click on email input");
        System.out.println("Write email");
        System.out.println("Hover on password input");
        System.out.println("Click on password input");
        System.out.println("Write password");
        System.out.println("Hover on log in button");
        System.out.println("Click on log in button");
        System.out.println("Validate user account access, it should be true");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println();
        System.out.println("Close browser");
    }

}