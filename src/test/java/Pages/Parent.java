package Pages;

import Utilities.Gwd;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {
    Duration dr=Duration.ofSeconds(30);
    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }
    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        scrollToElement(element);
        waitUntilLoading();
        element.click();
    }
    public void waitUntilVisible(WebElement element) {
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        WebDriverWait wait=new WebDriverWait(Gwd.getDriver(), dr);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) Gwd.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }



    public void waitUntilClickable(WebElement element) {
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        WebDriverWait wait = new WebDriverWait(Gwd.getDriver(), dr);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }
    public void waitUntilLoading() {
        WebDriverWait wait = new WebDriverWait(Gwd.driver,dr);
        By fuseBar=By.cssSelector("[style='display: true;']");
        wait.until(ExpectedConditions.numberOfElementsToBe(fuseBar,0));
    }

    public void waitUntilInvisible() {
        WebDriverWait wait = new WebDriverWait(Gwd.driver,dr);
        By loadingMask=By.cssSelector("[style='display: true;']");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingMask));
    }

    public void findAndSelectFunction(WebElement element, String text) {
        waitUntilClickable(element);
        Select elementSelect=new Select(element);
        elementSelect.selectByVisibleText(text);
    }
    public void findAndHoverFunction(WebElement element)
    {
        waitUntilClickable(element);
        scrollToElement(element);
        Actions actions=new Actions(Gwd.driver);
        actions.moveToElement(element).perform();
    }


}