package org.espn.configuration;

import org.espn.reporting.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private WebDriver driver;

    public Driver(String browser) {

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
                break;

//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                this.driver = new FirefoxDriver();
//                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
