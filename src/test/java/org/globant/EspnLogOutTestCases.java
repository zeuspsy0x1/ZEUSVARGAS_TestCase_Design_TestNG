package org.globant;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class EspnLogOutTestCases {

    private static final Logger log = java.util.logging.Logger.getLogger("myLog");

    @BeforeClass
    public void openBrowser(){
        System.out.println();
        log.info("Open browser and redirect to https://www.espnqa.com/?_adbock=true&src=com");

    }

    @Test (priority = 2)
    public void LogOut (){
        System.out.println();
        System.out.println("****************  Log out  ****************");
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
        System.out.println("Hover on person icon in the top right");
        System.out.println("Hover on Log Out option");
        System.out.println("Click on Log Out button");
        System.out.println("Validate user account access, it should be false");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println();
        log.info("Close browser");
        System.out.println();
    }
}