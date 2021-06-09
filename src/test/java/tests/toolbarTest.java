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
        List<String> listOfElements = Arrays.asList(
                "Simple Form Demo",
                "Checkbox Demo",
                "Radio Buttons Demo",
                "Select Dropdown List",
                "Input Form Submit",
                "Ajax Form Submit",
                "JQuery Select dropdown"
        );

        toolBarPage.getInputFormsTool().click();
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.INPUT_FORMS + "/../ul/li/a")).get(counter).getText(), listOfElements.get(counter));
        }
    }

    @Test
    public void testDatePickers() {
        List<String> listOfElements = Arrays.asList(
                "Bootstrap Date Picker",
                "JQuery Date Picker"
        );

        toolBarPage.getDatePickersTool().click();
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.DATE_PICKERS + "/../ul/li/a")).get(counter).getText(), listOfElements.get(counter));
        }
    }

    @Test
    public void testTable() {
        List<String> listOfElements = Arrays.asList(
                "Table Pagination",
                "Table Data Search",
                "Table Filter",
                "Table Sort & Search",
                "Table Data Download"
        );

        toolBarPage.getTableTool().click();
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.TABLE + "/../ul/li/a")).get(counter).getText(), listOfElements.get(counter));
        }
    }

    @Test
    public void testDemoHome(){
        Asserts.assertTrue("Demo Home is displayed", toolBarPage.getDemoHomeTool().isDisplayed());
    }

    @Test
    public void testProgressBars() {
        List<String> listOfElements = Arrays.asList(
                "JQuery Download Progress bars",
                "Bootstrap Progress bar",
                "Drag & Drop Sliders"
        );

        toolBarPage.getProgressBarsTool().click();
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.PROGRESS_BARS + "/../ul/li/a")).get(counter).getText(), listOfElements.get(counter));
        }
    }

    @Test
    public void testAlertsModals() {
        List<String> listOfElements = Arrays.asList(
                "Bootstrap Alerts",
                "Bootstrap Modals",
                "Window Popup Modal",
                "Progress Bar Modal",
                "Javascript Alerts",
                "File Download"
        );

        toolBarPage.getAlertsModalsTool().click();
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.ALERTS_MODALS + "/../ul/li/a")).get(counter).getText(), listOfElements.get(counter));
        }
    }

    @Test
    public void testListBox() {
        List<String> listOfElements = Arrays.asList(
                "Bootstrap List Box",
                "JQuery List Box",
                "Data List Filter"
        );

        toolBarPage.getListBoxool().click();
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.LIST_BOX + "/../ul/li/a")).get(counter).getText(), listOfElements.get(counter));
        }
    }

    @Test
    public void testOthers() {
        List<String> listOfElements = Arrays.asList(
                "Drag and Drop",
                "Dynamic Data Loading",
                "Charts Demo"
        );

        toolBarPage.getOthersTool().click();
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible in toolbar", driver.findElements(By.xpath(toolBarPage.OTHERS + "/../ul/li/a")).get(counter).getText(), listOfElements.get(counter));
        }
    }

}
