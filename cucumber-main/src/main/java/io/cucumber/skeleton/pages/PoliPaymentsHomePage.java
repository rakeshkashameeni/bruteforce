package io.cucumber.skeleton.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;


public class PoliPaymentsHomePage extends BasePage {

    public PoliPaymentsHomePage(WebDriver driver){
        super(driver);
    }

    By sellLink = By.xpath("//*[@id=\"navmenu\"]/ul/li[3]/a/span");
    By makeSaleEnquiry = By.xpath("//*[@id=\"navmenu\"]/ul/li[3]/ul/li[9]/a");

    public void switchToWindow(){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
             }
        }
    }

    public PoliContactUsPage clickMakeSalesEnquiry() {
            new Actions(driver).moveToElement(driver.findElement(sellLink)).build().perform();
            WebElement makeASalesEnquiry = driver.findElement(makeSaleEnquiry);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",makeASalesEnquiry);
            return new PoliContactUsPage(driver);

    }

    public boolean isPoliHomePageDisplayed() {
        switchToWindow();
        return driver.findElement(By.xpath("//p[contains(text(),'Buy with POLi')]")).isDisplayed();
    }
}
