package StepDefinitions;

import Pages.MainPage;
import Utilities.Gwd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_CreateAccountSteps {
    MainPage mainPage =new MainPage();

    @Given("Navigate to Luma")
    public void navigateToLuma() {
        Gwd.getDriver().get("https://magento.softwaretestingboard.com/");
        Gwd.getDriver().manage().window().maximize();
    }

    @When("Signup a new user")
    public void signupANewUser() {
        mainPage.findAndClick("createAccountLink");
        mainPage.findAndSend("usernameInput","Horasanlı");
        mainPage.findAndSend("lastnameInput","Hasan");
        mainPage.findAndSend("emailInput","horansanlim@gmail.com");
        mainPage.findAndSend("passwordInput","UWmA6ZAaZ9WqjWS");
        mainPage.findAndSend("passConfirmInput","UWmA6ZAaZ9WqjWS");
        mainPage.findAndClick("createAccountButton");
    }

    @Then("User should signup successfully")
    public void userShouldLoginSuccessfully() {
        mainPage.findAndContainsText("accountSuccess","Thank you for registering");
        //mainPage.findAndClick("acceptCookies");
    }


}
