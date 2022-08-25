package StepDefinitions;

import Pages.MainPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _05_DataTableSteps {
    /*MainPage mainPage =new MainPage();
    @And("Click on the element in the Left Navigation Panel")
    public void clickOnTheElementInTheLeftNavigationPanel(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i=0; i<listElement.size(); i++) {
            //System.out.println("listElement.get(i) = " + listElement.get(i));
            leftNav.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i=0; i<listElement.size(); i++) {
            mainPage.findAndClick(listElement.get(i));
        }
    }

    @And("User sends the keys in dialog content")
    public void userSendsTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i=0; i<listElement.size(); i++) {
            mainPage.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @And("User deletes item from Dialog")
    public void userDeletesItemFromDialog(DataTable elements) {
        List<String> listElement=elements.asList(String.class);
        for (int i=0; i<listElement.size(); i++) {
            mainPage.searchAndDelete(listElement.get(i));
        }
    }

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i=0; i<listElement.size(); i++) {
            formContent.findAndClick(listElement.get(i));
        }
    }*/
}
