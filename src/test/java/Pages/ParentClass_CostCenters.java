package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ParentClass_CostCenters {



    WebDriver driver;
    WebDriverWait wait;


    public ParentClass_CostCenters() {

        driver= Driver.getDriver();
        wait=new WebDriverWait(driver,10);


    }
    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));


    }
    public  void  waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);

    }

    public void clickElement(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }
    public void sendKeysElement(WebElement element,String text){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);


    }



    public void verifyElementContainsText(WebElement element, String text){
        waitUntilVisible(element);
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));

        System.out.println(element.getText());
        System.out.println(text);

        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));



    }
    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }


}
