package StepDefinitions;

import Pages.MainPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class _03_AddAddressStoryOutline {
    MainPage mainPage=new MainPage();
    @And("Go to My Account Page -> Manage Addresses -> Add New Address Page")
    public void goToMyAccountPageManageAddress() {
        mainPage.findAndClick("arrow");
        mainPage.findAndClick("myAccountLink");
        mainPage.findAndClick("manageAddresses");
        mainPage.findAndClick("addNewAddress");
    }

    @And("Add a new address - Select Country")
    public void addANewAddressSelectCountry(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (int i=0; i<listElements.size(); i++) {
            mainPage.findAndSelect(listElements.get(i).get(0),listElements.get(i).get(1));
        }
    }

    @And("Add a new address")
    public void addANewAddress(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);

        for (int i=0; i<listElements.size(); i++) {
            mainPage.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }
        mainPage.findAndClick("saveAddress");
    }

    @Then("User should add a new address successfully")
    public void userShouldAddANewAddressSuccessfully() {
        mainPage.findAndContainsText("addressSaveSuccess","You saved");
    }
}
