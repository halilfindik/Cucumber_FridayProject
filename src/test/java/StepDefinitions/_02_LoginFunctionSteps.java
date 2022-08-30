package StepDefinitions;

import Pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginFunctionSteps {
    MainPage mainPage=new MainPage();
    @When("User logins with valid credentials")
    public void userLoginsWithValidCredentials() {
        mainPage.findAndClick("signInLink");
        mainPage.findAndSend("email","horansanlim4@gmail.com");
        mainPage.findAndSend("pass","UWmA6ZAaZ9WqjWS");
        mainPage.findAndClick("signInButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        mainPage.findAndContainsText("loginSuccessMessage","Welcome");
    }
}
