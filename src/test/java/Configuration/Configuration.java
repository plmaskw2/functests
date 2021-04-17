package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static final String SITE_ADDRESS_PROPERTY = "test.site.url";
    private static final String CHROME_DRIVER_LOCATION_PROPERTY = "chrome.driver.location";
    private static final String FIREFOX_DRIVER_LOCATION_PROPERTY = "firefox.driver.location";
    private static final String OPERATIONAL_SYSTEM= "os.location";
    private static Configuration configuration;
    private Properties properties;
    private String os;
    private String siteURL;
    private String chromeDriverLocation;
    private String firefoxDriverLocation;

    private Configuration() {
        try {
            properties = new Properties();
            InputStream is = new FileInputStream("src/test/config/TempFiles/os.properties");
            properties.load(is);
        } catch (
                IOException exception) {
            throw new ExceptionInInitializerError(exception);
        }
        siteURL = extractProperty(SITE_ADDRESS_PROPERTY);
        chromeDriverLocation = extractProperty(CHROME_DRIVER_LOCATION_PROPERTY);
        firefoxDriverLocation = extractProperty(FIREFOX_DRIVER_LOCATION_PROPERTY);
        os = extractProperty(OPERATIONAL_SYSTEM);
    }

    private String extractProperty(String propertyName) {
        String property = System.getProperty(propertyName);
        if (property == null) {
            property = properties.getProperty(propertyName);
        }
        return property;
    }

    public static Configuration getConfiguration() {
        if (configuration == null) {
            configuration = new Configuration();
        }
        return configuration;
    }

    public String getSiteURL() {
        return siteURL;
    }

    public String getChromeDriverLocation() {
        return chromeDriverLocation;
    }

    public String getFirefoxDriverLocation() {
        return firefoxDriverLocation;
    }

    public String getOperationalSystem() {
        return os;
    }
}
