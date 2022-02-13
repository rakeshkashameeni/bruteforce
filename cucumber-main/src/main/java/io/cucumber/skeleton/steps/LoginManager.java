package io.cucumber.skeleton.steps;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import io.cucumber.skeleton.ConfigManager;


import static io.restassured.RestAssured.given;

public class LoginManager {


    static CompletableFuture<String> loginTask = CompletableFuture.supplyAsync(new Supplier<String>() {
        @Override
        public String get() {
            int statusCode = 0;
            try {




                 statusCode= given()
                         .header("User-Agent", "MyAppName")
                         .header("Authorization", "Basic " + ConfigManager.getProp("auth"))
                         .when().get("https://www.google.com/login:8080")
                         .getStatusCode();

            } catch (Exception e) {
                return String.valueOf(statusCode);
            }
            return String.valueOf(statusCode);
        }
    });
}
