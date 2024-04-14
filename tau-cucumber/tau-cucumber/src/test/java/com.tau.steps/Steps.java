package com.tau.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Steps {
    WebDriver driver;

    @Before()
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("I am in the login page of SauceDemo App")
    public void i_am_in_the_login_page_of_sauce_demo_app() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter valid {string} and {string}")
    public void i_enter_valid_credentials(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be taken to the Dashboard page")
    public void i_should_be_taken_to_the_dashboard_page() {
        driver.findElement(By.className("title")).isDisplayed();
    }

    @After()
    public void quitBrowser() {
        driver.quit();
    }
}
