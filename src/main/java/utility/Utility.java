package utility;

import browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class Utility extends ManageBrowser {

    /**
     * This method will click on element
     *
     * @ param by
     */
    public void pmClickOnElement(By by) {
        WebElement link = driver.findElement(by);
        link.click();
    }

    /**
     * This method will get text from element
     */
    public String doGetTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }



    /**
     * This Method will verify text using Assert
     */
    public void verifyText(String expectedMessage, By by, String displayMessage) {
        String actualMessage = doGetTextFromElement(by);
        Assert.assertEquals(actualMessage, expectedMessage, displayMessage);
    }


    /**
     * This method will get the list of elements
     */
    public List<WebElement> findElementsFromWebPage(By by){
        return driver.findElements(by);
    }

}
