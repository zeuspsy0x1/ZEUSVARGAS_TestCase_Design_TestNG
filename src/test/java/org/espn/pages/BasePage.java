package org.espn.pages;

import org.espn.configuration.WebOperations;
import org.openqa.selenium.WebDriver;

// allows me to send the webOperations methods to its children
public class BasePage extends WebOperations {

public BasePage(WebDriver driver) {
        super(driver);
    }
}
