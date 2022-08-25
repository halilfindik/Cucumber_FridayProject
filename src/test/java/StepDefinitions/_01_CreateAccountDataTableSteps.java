package StepDefinitions;

import Pages.MainPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_CreateAccountDataTableSteps {

    MainPage mainPage=new MainPage();
    @When("Signup a new user with DataTable")
    public void signupANewUserWithDataTable(DataTable elements) {
        mainPage.findAndClick("createAccountLink");
        List<List<String>> listElements=elements.asLists(String.class);

        for (int i=0; i<listElements.size(); i++) {
            mainPage.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }
        mainPage.findAndClick("createAccountButton");
    }
}
