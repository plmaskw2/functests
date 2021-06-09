package tests;

import Configuration.Configuration;
import Configuration.Driver;
import PageObjects.Asserts;
import PageObjects.PopupsAlerts;
import PageObjects.ToolBarPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class toolbarTest {

    WebDriver driver = Driver.initializeWebDriver();
    PopupsAlerts popupsAlerts = new PopupsAlerts(driver);
    ToolBarPage toolBarPage = new ToolBarPage(driver);

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
    public void testInputForms() {
        toolBarPage.getInputFormsTool().click();
        for(int counter = 0; counter < toolBarPage.listOfElementsInputForms.size(); counter++) {
            Asserts.assertEquals(toolBarPage.listOfElementsInputForms.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.INPUT_FORMS + "/../ul/li/a")).get(counter).getText(), toolBarPage.listOfElementsInputForms.get(counter));
        }
    }

    @Test
    public void testDatePickers() {
        toolBarPage.getDatePickersTool().click();
        for(int counter = 0; counter < toolBarPage.listOfElementsDatePickiers.size(); counter++) {
            Asserts.assertEquals(toolBarPage.listOfElementsDatePickiers.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.DATE_PICKERS + "/../ul/li/a")).get(counter).getText(), toolBarPage.listOfElementsDatePickiers.get(counter));
        }
    }

    @Test
    public void testTable() {
        toolBarPage.getTableTool().click();
        for(int counter = 0; counter < toolBarPage.listOfElementsTable.size(); counter++) {
            Asserts.assertEquals(toolBarPage.listOfElementsTable.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.TABLE + "/../ul/li/a")).get(counter).getText(), toolBarPage.listOfElementsTable.get(counter));
        }
    }

    @Test
    public void testDemoHome(){
        Asserts.assertTrue("Demo Home is displayed", toolBarPage.getDemoHomeTool().isDisplayed());
    }

    @Test
    public void testProgressBars() {
        toolBarPage.getProgressBarsTool().click();
        for(int counter = 0; counter < toolBarPage.listOfElementsProgressBars.size(); counter++) {
            Asserts.assertEquals(toolBarPage.listOfElementsProgressBars.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.PROGRESS_BARS + "/../ul/li/a")).get(counter).getText(), toolBarPage.listOfElementsProgressBars.get(counter));
        }
    }

    @Test
    public void testAlertsModals() {
        toolBarPage.getAlertsModalsTool().click();
        for(int counter = 0; counter < toolBarPage.listOfElementsAlertsModals.size(); counter++) {
            Asserts.assertEquals(toolBarPage.listOfElementsAlertsModals.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.ALERTS_MODALS + "/../ul/li/a")).get(counter).getText(), toolBarPage.listOfElementsAlertsModals.get(counter));
        }
    }

    @Test
    public void testListBox() {
        toolBarPage.getListBoxool().click();
        for(int counter = 0; counter < toolBarPage.listOfElementsListBox.size(); counter++) {
            Asserts.assertEquals(toolBarPage.listOfElementsListBox.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.LIST_BOX + "/../ul/li/a")).get(counter).getText(), toolBarPage.listOfElementsListBox.get(counter));
        }
    }

    @Test
    public void testOthers() {
        toolBarPage.getOthersTool().click();
        for(int counter = 0; counter < toolBarPage.listOfElementsOthers.size(); counter++) {
            Asserts.assertEquals(toolBarPage.listOfElementsOthers.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.OTHERS + "/../ul/li/a")).get(counter).getText(), toolBarPage.listOfElementsOthers.get(counter));
        }
    }

}
