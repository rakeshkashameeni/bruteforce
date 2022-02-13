package io.cucumber.skeleton.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import java.util.concurrent.*;


public class StepDefinitions  {




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
