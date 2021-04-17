package tests;


import Configuration.Configuration;
import Configuration.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SimpleFirstTest {

    WebDriver driver = Driver.initializeWebDriver();

    @Before
    public void setUp() {
        driver.get(Configuration.getConfiguration().getSiteURL());
    }

    @Test
    public void test1(){

    }

    @After
    public void tearDown(){

    }
}
