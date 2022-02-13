package io.cucumber.skeleton.pages;

import org.openqa.selenium.*;


public class SecurePayHomePage extends BasePage {

    public SecurePayHomePage(WebDriver driver){
        super(driver);
    }


    By pricingMenu = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/header/div/div/div[2]/nav/ul/li[2]/div/span");
    By standardPricingLink = By.linkText("Standard pricing");
    By polyLearnMoreLink = By.xpath("//a[@href=\"https://www.polipayments.com/\" and text()='Learn more']");


    public PoliPaymentsHomePage clickOnLearnMoreLink(){
        driver.findElement(polyLearnMoreLink).click();
        return new PoliPaymentsHomePage(driver);
    }


    public void navigateToPricingPage() {
        driver.findElement(pricingMenu).click();
        driver.findElement(standardPricingLink).click();
    }

    public boolean isPricingHeaderDisplayed() {
        return driver.findElement(By.xpath("//h1[text()='Pricing']")).isDisplayed();
    }
}
