package io.cucumber.skeleton.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HookSteps {
    public TestContext context;

    public HookSteps(TestContext context){
        this.context = context;
    }

    //open browser before each scenario
   /* @Before
    public void startBrowser(){

        WebDriverManager.chromedriver().setup();

        // System.setProperty("webdriver.chrome.driver","target/test-classes/chromedriver94");
        //driver = new RemoteWebDriver(new url(""))
        context.driver = new ChromeDriver();
        context.driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

    //close browser after scenario
    @After
    public void closeBrowser(){
        WebDriver driver = context.driver;
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            driver.switchTo().window(ChildWindow);
            driver.close();
        }

        try{
            driver.quit();
        }catch (Exception ex){
            System.out.println("Exception occurred" + ex.getMessage());
        }

    }


*/
}
