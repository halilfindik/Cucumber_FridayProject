package StepDefinitions;

import Pages.MainPage;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;

public class _04_ProductPurchaseSteps {

    MainPage mainPage=new MainPage();
    @When("User adds a product to cart")
    public void userAddsAProductToCart() {
        mainPage.findAndClick("logo");
        mainPage.findAndClick("shirt");
        mainPage.findAndClick("large");
        mainPage.findAndClick("grayColor");
        mainPage.findAndClick("addToCartButton");
    }

    @Then("User should successfully add product to cart")
    public void userShouldSuccessfullyAddProductToCart() {
        mainPage.findAndContainsText("AddToCartSuccess","You added");
    }

    @And("User buys the product")
    public void userBuysTheProduct() {
        mainPage.findAndClick("addToCart");
        mainPage.findAndClick("proceedToCheckOut");
        mainPage.waitUntilInvisible();
        mainPage.findAndClick("next");
        mainPage.waitUntilInvisible();
        mainPage.waitUntilVisible();
        mainPage.findAndClick("placeOrder");
    }

    @Then("Verify the purchase")
    public void verifyThePurchase() {
        mainPage.waitUntilInvisible();
        mainPage.findAndContainsText("purchaseSuccess","Thank you");
    }


}
