package io.cucumber.skeleton.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleResultsPage extends BasePage {

    public GoogleResultsPage(WebDriver driver){
        super(driver);
    }


    By securePayLink = By.xpath("//a[@href='https://www.securepay.com.au/']");

    public SecurePayHomePage clickSecurePayLink() {
        driver.findElement(securePayLink).click();
        return new SecurePayHomePage(driver);
    }
}
