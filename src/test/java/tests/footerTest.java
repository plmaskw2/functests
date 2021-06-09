package tests;

import Configuration.Configuration;
import Configuration.Driver;
import PageObjects.Asserts;
import PageObjects.FooterPage;
import PageObjects.PopupsAlerts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class footerTest {
    WebDriver driver = Driver.initializeWebDriver();
    PopupsAlerts popupsAlerts = new PopupsAlerts(driver);
    FooterPage footerPage = new FooterPage(driver);

    @Before
    public void setUp(){
        driver.get(Configuration.getConfiguration().getSiteURL());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        popupsAlerts.closeWelcomePopup();
    }

    @Test
    public void tutorialsMenuTest(){
        List<String> listOfElements = Arrays.asList(
                "Selenium Tutorials",
                "TestNG Tutorial",
                "JUnit Tutorial",
                "JXL Tutorial",
                "Apache POI",
                "ANT Tutorial",
                "Maven Tutorial"
        );
        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible", listOfElements.get(counter), driver.findElements(By.xpath(footerPage.TUTORIALS_MENU + "/../ul/li/a")).get(counter).getText());
        }
    }

    @Test
    public void popularPostsTest(){
        List<String> listOfElements = Arrays.asList(
                "Gecko Driver Selenium 3",
                "Page Factory Pattern",
                "Execute Tests in Jenkins",
                "TestNG Custom Report",
                "Execute Selenium tests using Maven",
                "View All Selenium Tutorials"
        );

        for(int counter = 0; counter < listOfElements.size(); counter++) {
            Asserts.assertEquals(listOfElements.get(counter) + " is visible", listOfElements.get(counter), driver.findElements(By.xpath(footerPage.POPULAR_POSTS + "/../ul/li/a")).get(counter).getText());
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
