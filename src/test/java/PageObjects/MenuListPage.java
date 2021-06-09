package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class MenuListPage extends GenericPage{

    public static final String MENU_LIST = "treemenu"; //ID
    public static final String ALL_EXAMPLES = "//a[contains(text(), \'All Examples\')]"; //XPATH

    public List<String> allExamplesList = Arrays.asList(
            "Input Forms",
            "Date pickers",
            "Table",
            "Progress Bars & Sliders",
            "Alerts & Modals",
            "List Box",
            "Others"
    );

    public List<String> datePickiersList = Arrays.asList(
            "Bootstrap Date Picker",
            "JQuery Date Picker"
    );

    public List<String> inputFormsList = Arrays.asList(
            "Simple Form Demo",
            "Checkbox Demo",
            "Radio Buttons Demo",
            "Select Dropdown List",
            "Input Form Submit",
            "Ajax Form Submit",
            "JQuery Select dropdown"
    );
    public List<String> tableList = Arrays.asList(
            "Table Pagination",
            "Table Data Search",
            "Table Filter",
            "Table Sort & Search",
            "Table Data Download"
    );

    public List<String> progressBarsList = Arrays.asList(
            "JQuery Download Progress bars",
            "Bootstrap Progress bar",
            "Drag & Drop Sliders"
    );
    public List<String> alertsModalsList = Arrays.asList(
            "Bootstrap Alerts",
            "Bootstrap Modals",
            "Window Popup Modal",
            "Progress Bar Modal",
            "Javascript Alerts",
            "File Download"
    );
    public List<String> listBoxList = Arrays.asList(
            "Bootstrap List Box",
            "JQuery List Box",
            "Data List Filter"
    );
    public List<String> othersList = Arrays.asList(
            "Drag and Drop",
            "Dynamic Data Loading",
            "Charts Demo"
    );

    public MenuListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getMenuList(){
        WebElement getMenuList = findElementByID(MENU_LIST);
        return getMenuList;
    }
}
