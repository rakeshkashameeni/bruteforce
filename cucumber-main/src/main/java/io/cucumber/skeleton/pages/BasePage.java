
package io.cucumber.skeleton.pages;

import org.openqa.selenium.WebDriver;


public class BasePage {
    WebDriver driver;

    protected BasePage(WebDriver driver){
        this.driver = driver;
    }

    /*
    public boolean waitUntilElementIsDisplayed(By by){
        try {
            new WebDriverWait(driver, 1)
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(driver.findElement(by)));
            return true;
        }catch (Exception ex){
            return false;
        }

    }*/

}
