package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends GenericPage {

    public static final String WELCOME_TEXT = "//h3[contains(text(), \'Welcome to Selenium Easy\')]"; //XPATH
    private static final String WELCOME_BUTTON = "home_bar"; // ID
    public static final String BASIC_TEXT = "//h3[contains(text(), \'Examples to start with Selenium\')]"; //XPATH
    private static final String BASIC_BUTTON = "basic_example"; // ID
    public static final String INTERMEDIATE_TEXT = "//h3[contains(text(), \'Examples with most popular components\')]"; //XPATH
    private static final String INTERMEDIATE_BUTTON = "inter_example"; // ID
    public static final String ADVANCED_TEXT = "//h3[contains(text(), \'Examples with Components\')]"; //XPATH
    private static final String ADVANCED_BUTTON = "advanced_example"; // ID
    public static final String COMPLETED_TEXT = "//h3[contains(text(), \'Thanks for staying tuned! \')]"; //XPATH
    private static final String COMPLETED_BUTTON = "done_example"; // ID

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickWelcome(){
        findElementByID(WELCOME_BUTTON).click();
        return this;
    }

    public HomePage clickBasic(){
        findElementByID(BASIC_BUTTON).click();
        return this;
    }

    public HomePage clickInter(){
        findElementByID(INTERMEDIATE_BUTTON).click();
        return this;
    }

    public HomePage clickAdvanced(){
        findElementByID(ADVANCED_BUTTON).click();
        return this;
    }

    public HomePage clickDone(){
        findElementByID(COMPLETED_BUTTON).click();
        return this;
    }
}
