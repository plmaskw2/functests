package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GenericPage {
    protected WebDriver driver;

    public GenericPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementByLinkText(String elementLinkText) {
        return driver.findElement(By.linkText(elementLinkText));
    }

    public WebElement findElementByID(String elementID) {
        return driver.findElement(By.id(elementID));
    }

    public WebElement findElementByXpath(String elementXpath) {
        return driver.findElement(By.xpath(elementXpath));
    }

    public WebElement findElementByCSS(String elementCSS) {
        return driver.findElement(By.cssSelector(elementCSS));
    }

    public void fluentWaitForElementIsDisplayed(WebElement elementToBeDisplayed) {
        new FluentWait<>(elementToBeDisplayed)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .until(webElement -> webElement.isDisplayed());
    }

    public void waitUntilElementVisibleById(String idOfElement){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idOfElement)));
    }

    public void waitUntilElementVisibleByCSS(String CSSOfElement){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CSSOfElement)));
    }
}