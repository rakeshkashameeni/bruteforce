package io.cucumber.skeleton.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.pages.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.*;


public class StepDefinitions  {
    WebDriver driver;
    GoogleHomePage googleHomePage;
    GoogleResultsPage googleResultsPage;
    SecurePayHomePage securePayHomePage;
    PoliPaymentsHomePage poliPaymentsHomePage;
    PoliContactUsPage poliContactUsPage;

    public StepDefinitions(TestContext context){

        this.driver = context.driver;
    }

    @Given("I am on Google Home page")
    public void iAmOnGoogleHomePage() {

        googleHomePage = new GoogleHomePage(driver);


    }

    @When("I search for SecurePay")
    public void iSearchForSecurePay() {

        googleResultsPage = googleHomePage.searchSecurePay();
    }

    @And("I click through to the SecurePay website")
    public void iClickThroughToTheSecurePayWebsite() {
        securePayHomePage = googleResultsPage.clickSecurePayLink();

    }

    @Then("I navigate to Pricing and Standard pricing")
    public void iNavigateToPricingAndStandardPricing() {
        securePayHomePage.navigateToPricingPage();

    }

    @Then("I verify that the pricing page is loaded")
    public void iVerifyThatThePricingPageIsLoaded() {
        Assert.assertTrue(securePayHomePage.isPricingHeaderDisplayed());
    }

    @When("I click on Learn More button under Poli")
    public void iClickOnLearnMoreButtonUnderPoli() {

        poliPaymentsHomePage = securePayHomePage.clickOnLearnMoreLink();
    }

    @Then("I verify that Poli site is opened and loaded in the new window")
    public void iVerifyThatPoliSiteIsOpenedAndLoadedInTheNewWindow() {
        Assert.assertTrue(poliPaymentsHomePage.isPoliHomePageDisplayed());
    }

    @When("I navigate to Sell and Make a sales enquiry on the POLi site")
    public void i_navigate_to_sell_and_make_a_sales_enquiry_on_the_po_li_site() {
        poliContactUsPage = poliPaymentsHomePage.clickMakeSalesEnquiry();
    }

    @And("I fill contact us form using random data")
    public void iFillContactUsFormUsingRandomData() {

        poliContactUsPage.fillForm();
    }



    @Given("Four users are logged in Brute force attack should be stopped")
    public void threeUsersAreLoggedIn() throws Exception {
        CompletableFuture<String> user1 = LoginManager.loginTask;
        CompletableFuture<String> user2 = LoginManager.loginTask;
        CompletableFuture<String> user3 = LoginManager.loginTask;
        CompletableFuture<String> user4 = LoginManager.loginTask;

        // Wait until all login tasks are done
        CompletableFuture.allOf(user1,user2,user3,user4).join();

        System.out.println("User1 -> " + user1.get());
        System.out.println("User2 -> " + user2.get());
        System.out.println("User3 -> " + user3.get());
        System.out.println("User4 -> " + user4.get());

        if ( user1.get().equalsIgnoreCase("200") &&  user2.get().equalsIgnoreCase("200")
                &&  user3.get().equalsIgnoreCase("200") &&  user4.get().equalsIgnoreCase("200"))
        {
            // defect
            Assert.fail("Brute force attacked not stopped");
        }
        else
        {
            System.out.println("Brute force attack stopped");
        }

        // logger.info("--> " + page1.get());
    }
}
