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

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void tutorialsMenuTest(){
        for(int counter = 0; counter < footerPage.listOfElementsTutorialsMenu.size(); counter++) {
            Asserts.assertEquals(footerPage.listOfElementsTutorialsMenu.get(counter) + " is visible", footerPage.listOfElementsTutorialsMenu.get(counter), driver.findElements(By.xpath(footerPage.TUTORIALS_MENU + "/../ul/li/a")).get(counter).getText());
        }
    }

    @Test
    public void popularPostsTest(){


        for(int counter = 0; counter < footerPage.listOfElementsPopularPosts.size(); counter++) {
            Asserts.assertEquals(footerPage.listOfElementsPopularPosts.get(counter) + " is visible", footerPage.listOfElementsPopularPosts.get(counter), driver.findElements(By.xpath(footerPage.POPULAR_POSTS + "/../ul/li/a")).get(counter).getText());
        }
    }
}
