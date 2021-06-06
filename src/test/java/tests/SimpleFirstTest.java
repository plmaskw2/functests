package tests;


import Configuration.Configuration;
import Configuration.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleFirstTest {

    WebDriver driver = Driver.initializeWebDriver();

    @Before
    public void setUp() {
        driver.get(Configuration.getConfiguration().getSiteURL());
    }

    @Test
    public void test1(){
        WebElement AGREE = driver.findElement(By.xpath("//div[text()='Zgadzam się']"));
        AGREE.click();

        WebElement GOOGLE_SEARCH = driver.findElement(By.xpath("//input[@type='submit']"));
        Assert.assertEquals("Szukaj w Google", GOOGLE_SEARCH.getAttribute("value"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
