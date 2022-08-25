package Pages;

import Utilities.Gwd;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Parent {

    public MainPage() {
        PageFactory.initElements(Gwd.getDriver(), this);
    }

    @FindBy(linkText="Create an Account")
    private WebElement createAccountLink;

    @FindBy(id = "firstname")
    private WebElement usernameInput;

    @FindBy(id = "lastname")
    private WebElement lastnameInput;

    @FindBy(id = "email_address")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "password-confirmation")
    private WebElement passConfirmInput;

    @FindBy(xpath = "(//span[contains(text(),'Create')])[2]")
    private WebElement createAccountButton;

    @FindBy(xpath = "//div[contains(text(),'Thank you')]")
    private WebElement accountSuccess;

    @FindBy(partialLinkText = "Sign In")
    private WebElement signInLink;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
    private WebElement signInButton;

    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    private WebElement loginSuccessMessage;


    WebElement myElement;
    public void findAndSend(String strElement, String value) {
        switch (strElement)
        {
            case "usernameInput"             : myElement=usernameInput; break;
            case "lastnameInput"             : myElement=lastnameInput; break;
            case "emailInput"                : myElement=emailInput; break;
            case "passwordInput"             : myElement=passwordInput; break;
            case "passConfirmInput"          : myElement=passConfirmInput; break;
            case "email"                     : myElement=email; break;
            case "pass"                      : myElement=password; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement)
        {
            case "createAccountLink"    : myElement=createAccountLink; break;
            case "createAccountButton"  : myElement=createAccountButton; break;
            case "signInLink"           : myElement=signInLink; break;
            case "signInButton"         : myElement=signInButton; break;
        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text) {
        switch (strElement)
        {
            case "accountSuccess"                : myElement = accountSuccess; break;
            case "loginSuccessMessage"           : myElement=loginSuccessMessage; break;

        }
        verifyContainsText(myElement, text);
    }
    public void searchAndDelete(String searchText) {
        findAndSend("searchInput",searchText); // arama kutucuğuna kelimeyi yaz
        findAndClick("searchButton"); // arama butonuna bas

        waitUntilLoading();

        findAndClick("deleteButton"); // silme butonuna bas
        findAndClick("deleteDialogButton"); // silmeyi onayla
    }
}