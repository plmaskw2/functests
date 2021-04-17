package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static Configuration.Configuration.getConfiguration;

public class Driver {


    private static WebDriver getSpecificDriver() {
        WebDriver driver = null;
        if (Configuration.getConfiguration().getOperationalSystem().contains("Win10")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            System.setProperty("webdriver.chrome.driver", getConfiguration().getChromeDriverLocation());
            driver = new ChromeDriver(options);
        }
        else if (Configuration.getConfiguration().getOperationalSystem().contains("Debian")){
            FirefoxOptions options = new FirefoxOptions();
            System.out.println("it contains firefox");
            options.addArguments("--start-maximized");
            System.setProperty("webdriver.gecko.driver", getConfiguration().getFirefoxDriverLocation());
            driver = new FirefoxDriver(options);
        }
        return driver;
    }

    public static WebDriver initializeWebDriver(){
        WebDriver driver = Driver.getSpecificDriver();
        return driver;
    }
}
