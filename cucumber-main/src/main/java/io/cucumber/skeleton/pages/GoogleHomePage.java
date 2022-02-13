package io.cucumber.skeleton.pages;

import io.cucumber.skeleton.ConfigManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver){
        super(driver);
    }


    By inputElement = By.xpath("//input[@title='Search']");
    By searchButton = By.xpath("//input[@value='Google Search']");


    public GoogleResultsPage searchSecurePay() {
        //System.getProperty("website")
        driver.get(ConfigManager.getProp("url"));
        driver.findElement(inputElement).sendKeys("secure pay");
        driver.findElement(searchButton).click();
        return new GoogleResultsPage(driver);
    }
}
