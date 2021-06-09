package tests;

import Configuration.Configuration;
import Configuration.Driver;
import PageObjects.Asserts;
import PageObjects.FooterPage;
import PageObjects.MenuListPage;
import PageObjects.PopupsAlerts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class menuTest {

    WebDriver driver = Driver.initializeWebDriver();
    PopupsAlerts popupsAlerts = new PopupsAlerts(driver);
    MenuListPage menuListPage = new MenuListPage(driver);

    @Before
    public void setUp(){
        driver.get(Configuration.getConfiguration().getSiteURL());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        popupsAlerts.closeWelcomePopup();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void menuTreeTest() throws InterruptedException {
        List<List<String>> listOfTreeElements =Arrays.asList(
                menuListPage.inputFormsList,
                menuListPage.datePickiersList,
                menuListPage.tableList,
                menuListPage.progressBarsList,
                menuListPage.alertsModalsList,
                menuListPage.listBoxList,
                menuListPage.othersList
                );


        for(int counter = 0; counter < menuListPage.allExamplesList.size(); counter++) {
            WebElement webElementTemp = driver.findElements(By.xpath(menuListPage.ALL_EXAMPLES + "/../ul/li/a")).get(counter);
            String webElementTempText = webElementTemp.getText();
            Asserts.assertEquals(menuListPage.allExamplesList.get(counter) + " is visible", webElementTempText, menuListPage.allExamplesList.get(counter));
            webElementTemp.click();
        }

        for(int counter = 0; counter < listOfTreeElements.size(); counter++) {
            for(String element : listOfTreeElements.get(counter)){
                Asserts.assertTrue(element + " is visible", driver.findElements(By.xpath("//a[contains(text(), \'" + element + "\')]")).get(1).isDisplayed());

            }
        }


    }
}
