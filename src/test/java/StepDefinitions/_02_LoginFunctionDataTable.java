package StepDefinitions;

import Pages.MainPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;

public class _02_LoginFunctionDataTable {
    MainPage mainPage=new MainPage();

    @When("User logins with valid credentials with DataTable")
    public void userLoginsWithValidCredentialsWithDataTable(DataTable elements) {
        mainPage.findAndClick("signInLink");

        List<List<String>> listElements=elements.asLists(String.class);

        for (int i=0; i<listElements.size(); i++) {
            mainPage.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }
        mainPage.findAndClick("signInButton");
    }
}
