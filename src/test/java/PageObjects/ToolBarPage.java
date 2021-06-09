package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class ToolBarPage extends GenericPage {

    public static final String INPUT_FORMS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Input Forms\')]"; //XPATH
    public static final String DATE_PICKERS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Date pickers\')]"; //XPATH
    public static final String TABLE = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Table\')]"; //XPATH
    public static final String DEMO_HOME = "//a[contains(text(), \'Demo Home\')]"; //XPATH
    public static final String PROGRESS_BARS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Progress Bars\')]"; //XPATH
    public static final String ALERTS_MODALS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Alerts & Modals\')]"; //XPATH
    public static final String LIST_BOX = "//a[@class=\'dropdown-toggle\'][contains(text(), \'List Box\')]"; //XPATH
    public static final String OTHERS = "//a[@class=\'dropdown-toggle\'][contains(text(), \'Others\')]"; //XPATH

    public List<String> listOfElementsInputForms = Arrays.asList(
            "Simple Form Demo",
            "Checkbox Demo",
            "Radio Buttons Demo",
            "Select Dropdown List",
            "Input Form Submit",
            "Ajax Form Submit",
            "JQuery Select dropdown"
    );
    public List<String> listOfElementsDatePickiers = Arrays.asList(
            "Bootstrap Date Picker",
            "JQuery Date Picker"
    );
    public List<String> listOfElementsTable = Arrays.asList(
            "Table Pagination",
            "Table Data Search",
            "Table Filter",
            "Table Sort & Search",
            "Table Data Download"
    );

    public List<String> listOfElementsProgressBars = Arrays.asList(
            "JQuery Download Progress bars",
            "Bootstrap Progress bar",
            "Drag & Drop Sliders"
    );
    public List<String> listOfElementsAlertsModals = Arrays.asList(
            "Bootstrap Alerts",
            "Bootstrap Modals",
            "Window Popup Modal",
            "Progress Bar Modal",
            "Javascript Alerts",
            "File Download"
    );
    public List<String> listOfElementsListBox = Arrays.asList(
            "Bootstrap List Box",
            "JQuery List Box",
            "Data List Filter"
    );
    public List<String> listOfElementsOthers = Arrays.asList(
            "Drag and Drop",
            "Dynamic Data Loading",
            "Charts Demo"
    );

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
