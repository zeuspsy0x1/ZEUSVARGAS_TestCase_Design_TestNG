import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EspnLogOutTestCases {

    @BeforeClass
    void openBrowser(){
        System.out.println();
        System.out.println("Open browser and redirect to https://www.espnqa.com/?_adbock=true&src=com");
    }

    @Test (priority = 2)
    void LogOut (){
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
    void closeBrowser(){
        System.out.println();
        System.out.println("Close browser");
    }
}