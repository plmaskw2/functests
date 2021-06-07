package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolBarPage extends GenericPage {

    public static final String INPUT_FORMS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Input Forms\')]"; //XPATH
    public static final String DATE_PICKERS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Date pickers\')]"; //XPATH
    public static final String TABLE = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Table\')]"; //XPATH
    public static final String DEMO_HOME = "//a[contains(text(), \'Demo Home\')]"; //XPATH
    public static final String PROGRESS_BARS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Progress Bars\')]"; //XPATH
    public static final String ALERTS_MODALS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Alerts & Modals\')]"; //XPATH
    public static final String LIST_BOX = "//a[@class=\'dropdown-toggle\'][contains(text(), \'List Box\')]"; //XPATH
    public static final String OTHERS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Others\')]"; //XPATH


    public ToolBarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInputFormsTool(){
        WebElement webElement = findElementByXpath(INPUT_FORMS);
        return webElement;
    }
    public WebElement getDatePickersTool(){
        WebElement webElement = findElementByXpath(DATE_PICKERS);
        return webElement;
    }
    public WebElement getTableTool(){
        WebElement webElement = findElementByXpath(TABLE);
        return webElement;
    }
    public WebElement getDemoHomeTool(){
        WebElement webElement = findElementByXpath(DEMO_HOME);
        return webElement;
    }
    public WebElement getProgressBarsTool(){
        WebElement webElement = findElementByXpath(PROGRESS_BARS);
        return webElement;
    }
    public WebElement getAlertsModalsTool(){
        WebElement webElement = findElementByXpath(ALERTS_MODALS);
        return webElement;
    }
    public WebElement getListBoxool(){
        WebElement webElement = findElementByXpath(LIST_BOX);
        return webElement;
    }
    public WebElement getOthersTool(){
        WebElement webElement = findElementByXpath(OTHERS);
        return webElement;
    }
}
