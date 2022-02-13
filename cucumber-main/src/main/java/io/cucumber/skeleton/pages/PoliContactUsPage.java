package io.cucumber.skeleton.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class PoliContactUsPage extends BasePage {

    public PoliContactUsPage(WebDriver driver){
        super(driver);
    }


    By companyTextBox = By.id("Company");
    By firstNameTextBox = By.id("FirstName");
    By lastNameTextBox = By.id("LastName");
    By enquiryTextBox = By.id("Description");
    By phoneTextBox = By.id("Phone");
    By websiteTextBox = By.id("Website");
    By emailTextBox = By.id("Email");

    public void fillForm(){
        try {
            Faker faker = new Faker();
            driver.findElement(companyTextBox).sendKeys(faker.regexify("[a-z]{10}"));
            driver.findElement(firstNameTextBox).sendKeys(faker.regexify("[a-z]{10}"));
            driver.findElement(lastNameTextBox).sendKeys(faker.regexify("[a-z]{10}"));
            driver.findElement(enquiryTextBox).sendKeys(faker.regexify("[a-z]{20}"));
            driver.findElement(phoneTextBox).sendKeys("0" + faker.regexify("[0-9]{9}"));
            driver.findElement(websiteTextBox).sendKeys("www." + faker.regexify("[a-z]{7}") + ".com");
            driver.findElement(emailTextBox).sendKeys(faker.regexify("[a-z]{10}") +"@gmail.com");
        }catch (Exception ex){}

    }
}
