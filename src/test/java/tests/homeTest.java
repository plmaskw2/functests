package tests;

import Configuration.Configuration;
import Configuration.Driver;
import PageObjects.Asserts;
import PageObjects.HomePage;
import PageObjects.PopupsAlerts;
import PageObjects.ToolBarPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class homeTest {
    WebDriver driver = Driver.initializeWebDriver();
    PopupsAlerts popupsAlerts = new PopupsAlerts(driver);
    HomePage homePage = new HomePage(driver);

    @Before
    public void setUp() {
        driver.get(Configuration.getConfiguration().getSiteURL());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        popupsAlerts.closeWelcomePopup();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void homeTest() throws InterruptedException {
        homePage.clickWelcome();
        Asserts.assertTrue("Welcome text is visible", driver.findElement(By.xpath(homePage.WELCOME_TEXT)).isDisplayed());
        Asserts.assertFalse("Basic text is not visible", driver.findElement(By.xpath(homePage.BASIC_TEXT)).isDisplayed());
        Asserts.assertFalse("Intermediate text is not visible", driver.findElement(By.xpath(homePage.INTERMEDIATE_TEXT)).isDisplayed());
        Asserts.assertFalse("Advance text is not visible", driver.findElement(By.xpath(homePage.ADVANCED_TEXT)).isDisplayed());
        Asserts.assertFalse("Completed text is not visible", driver.findElement(By.xpath(homePage.COMPLETED_TEXT)).isDisplayed());

        homePage.clickBasic();
        Thread.sleep(1000);
        Asserts.assertFalse("Welcome Test is not visible", driver.findElement(By.xpath(homePage.WELCOME_TEXT)).isDisplayed());
        Asserts.assertTrue("Basic text is visible", driver.findElement(By.xpath(homePage.BASIC_TEXT)).isDisplayed());
        Asserts.assertFalse("Intermediate text is not visible", driver.findElement(By.xpath(homePage.INTERMEDIATE_TEXT)).isDisplayed());
        Asserts.assertFalse("Advance text is not visible", driver.findElement(By.xpath(homePage.ADVANCED_TEXT)).isDisplayed());
        Asserts.assertFalse("Completed text is not visible", driver.findElement(By.xpath(homePage.COMPLETED_TEXT)).isDisplayed());

        homePage.clickInter();
        Thread.sleep(1000);
        Asserts.assertFalse("Welcome Test is not visible", driver.findElement(By.xpath(homePage.WELCOME_TEXT)).isDisplayed());
        Asserts.assertFalse("Basic text is not visible", driver.findElement(By.xpath(homePage.BASIC_TEXT)).isDisplayed());
        Asserts.assertTrue("Intermediate text is visible", driver.findElement(By.xpath(homePage.INTERMEDIATE_TEXT)).isDisplayed());
        Asserts.assertFalse("Advance text is not visible", driver.findElement(By.xpath(homePage.ADVANCED_TEXT)).isDisplayed());
        Asserts.assertFalse("Completed text is not visible", driver.findElement(By.xpath(homePage.COMPLETED_TEXT)).isDisplayed());

        homePage.clickAdvanced();
        Thread.sleep(1000);
        Asserts.assertFalse("Welcome Test is not visible", driver.findElement(By.xpath(homePage.WELCOME_TEXT)).isDisplayed());
        Asserts.assertFalse("Basic text is not visible", driver.findElement(By.xpath(homePage.BASIC_TEXT)).isDisplayed());
        Asserts.assertFalse("Intermediate text is not visible", driver.findElement(By.xpath(homePage.INTERMEDIATE_TEXT)).isDisplayed());
        Asserts.assertTrue("Advance text is visible", driver.findElement(By.xpath(homePage.ADVANCED_TEXT)).isDisplayed());
        Asserts.assertFalse("Completed text is not visible", driver.findElement(By.xpath(homePage.COMPLETED_TEXT)).isDisplayed());

        homePage.clickDone();
        Thread.sleep(1000);
        Asserts.assertFalse("Welcome Test is not visible", driver.findElement(By.xpath(homePage.WELCOME_TEXT)).isDisplayed());
        Asserts.assertFalse("Basic text is not visible", driver.findElement(By.xpath(homePage.BASIC_TEXT)).isDisplayed());
        Asserts.assertFalse("Intermediate text is not visible", driver.findElement(By.xpath(homePage.INTERMEDIATE_TEXT)).isDisplayed());
        Asserts.assertFalse("Advance text is not visible", driver.findElement(By.xpath(homePage.ADVANCED_TEXT)).isDisplayed());
        Asserts.assertTrue("Completed text is visible", driver.findElement(By.xpath(homePage.COMPLETED_TEXT)).isDisplayed());
    }
}
