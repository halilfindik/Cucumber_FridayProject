package Pages;

import Utilities.Gwd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends Parent {

    public MainPage() {
        PageFactory.initElements(Gwd.getDriver(), this);
    }

    @FindBy(linkText = "Create an Account")
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

    //@FindBy(xpath = "(//*[@data-action='customer-menu-toggle'])[1]")
    @FindBy(xpath = "(//span//button)[1]")
    private WebElement arrow;

    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;

    @FindBy(linkText = "Manage Addresses")
    private WebElement manageAddresses;

    @FindBy(xpath = "//span[contains(text(),'Add New Add')]")
    private WebElement addNewAddress;

    @FindBy(id = "street_1")
    private WebElement street1;

    @FindBy(id = "telephone")
    private WebElement telephone;

    @FindBy(id = "city")
    private WebElement city;

    //@FindBy(id = "region_id")
    //private WebElement regionSelect;

    @FindBy(id = "zip")
    private WebElement zipCode;

    @FindBy(id = "country")
    private WebElement countrySelect;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveAddress;

    @FindBy(xpath = "//div[contains(text(),'You saved')]")
    private WebElement addressSaveSuccess;

    @FindBy(css = "[class='logo']>img")
    private WebElement logo;

    @FindBy(xpath = "(//li[@class='product-item'])[3]")
    private WebElement shirt;

    @FindBy(xpath = "(//div[@class='swatch-option text'])[5]")
    private WebElement large;

    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    private WebElement grayColor;

    @FindBy(xpath = "(//button[@title='Add to Cart'])[3]")
    private WebElement hoverAddToCart;

    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(css = "span~span[class='counter qty']")
    private WebElement addToCart;

    @FindBy(xpath = "//div[contains(@data-bind,'message.text')]")
    private WebElement addToCartSuccess;

    @FindBy(css = "div>[class='action showcart']")
    private WebElement showCart;

    @FindBy(id = "top-cart-btn-checkout")
    private WebElement proceedToCheckOut;

    //@FindBy(xpath = "//*[text()='Next']/parent::button")
    @FindBy(xpath = "(//*[@class='primary'])[2]")
    private WebElement next;

    @FindBy(xpath = "//span[text()='Place Order']")
    private WebElement placeOrder;

    @FindBy(css = "h1>span")
    private WebElement purchaseSuccess;

    @FindBy(css = "[class='details-qty qty']>input")
    private WebElement cartProductQty;

    @FindBy(css = "[class='details-qty qty']>button")
    private WebElement updateButton;

    @FindBy(css = "#checkout>#checkout-loader")
    private WebElement loadingMask;

        @FindBy(css = "[class='payment-method-title field choice']")
    private WebElement paymentMethodContent;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "usernameInput"    : myElement = usernameInput; break;
            case "lastnameInput"    : myElement = lastnameInput; break;
            case "emailInput"       : myElement = emailInput; break;
            case "passwordInput"    : myElement = passwordInput; break;
            case "passConfirmInput" : myElement = passConfirmInput; break;
            case "email"            : myElement = email; break;
            case "pass"             : myElement = password; break;
            case "street1"          : myElement = street1; break;
            case "telephone"        : myElement = telephone; break;
            case "city"             : myElement = city; break;
            case "zipCode"          : myElement = zipCode; break;
            case "cartProductQty"   : myElement = cartProductQty; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "createAccountLink"    : myElement = createAccountLink; break;
            case "createAccountButton"  : myElement = createAccountButton; break;
            case "signInLink"           : myElement = signInLink; break;
            case "signInButton"         : myElement = signInButton; break;
            case "myAccountLink"        : myElement = myAccountLink; break;
            case "manageAddresses"      : myElement = manageAddresses; break;
            case "saveAddress"          : myElement = saveAddress; break;
            case "arrow"                : myElement = arrow; break;
            case "addNewAddress"        : myElement = addNewAddress; break;
            case "shirt"                : myElement = shirt; break;
            case "hoverAddToCart"       : myElement = hoverAddToCart; break;
            case "logo"                 : myElement = logo; break;
            case "large"                : myElement = large; break;
            case "grayColor"            : myElement = grayColor; break;
            case "addToCart"            : myElement = addToCart; break;
            case "addToCartButton"      : myElement = addToCartButton; break;
            case "showCart"             : myElement = showCart; break;
            case "proceedToCheckOut"    : myElement = proceedToCheckOut; break;
            case "next"                 : myElement = next; break;
            case "placeOrder"           : myElement = placeOrder; break;
            case "updateButton"         : myElement = updateButton; break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "accountSuccess"        : myElement = accountSuccess; break;
            case "loginSuccessMessage"   : myElement = loginSuccessMessage; break;
            case "addressSaveSuccess"    : myElement = addressSaveSuccess; break;
            case "AddToCartSuccess"      : myElement = addToCartSuccess; break;
            case "purchaseSuccess"       : myElement = purchaseSuccess; break;
        }
        verifyContainsText(myElement, text);
    }

    public void findAndSelect(String strElement, String text) {
        switch (strElement) {
            case "countrySelect": myElement = countrySelect; break;
        }
        findAndSelectFunction(myElement, text);
    }

    public void findAndHover(String strElement) {
        switch (strElement) {
            case "shirt": myElement = shirt; break;
        }
        findAndHoverFunction(myElement);
    }
    public void findAndWait(String strElement) {
        switch (strElement) {
            case "shirt": myElement = shirt; break;
        }
        //findAndWaitFunction(myElement);
    }
    public void Bekle() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void waitUntilInvisible() {
        WebDriverWait wait = new WebDriverWait(Gwd.driver,dr);
        //By loadingMask=By.cssSelector("#checkout>#checkout-loader");
        wait.until(ExpectedConditions.invisibilityOf(loadingMask));
    }
    public void waitUntilVisible() {
        WebDriverWait wait = new WebDriverWait(Gwd.driver,dr);
        wait.until(ExpectedConditions.visibilityOf(paymentMethodContent));
    }

}