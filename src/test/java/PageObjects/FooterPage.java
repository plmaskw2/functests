package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class FooterPage extends GenericPage{

    public static final String FOOTER = "//footer[@class=\'footer\']"; //XPATH
    public static final String TUTORIALS_MENU = "//h4[contains(text(), \'Tutorials Menu\')]"; //XPATH
    public static final String POPULAR_POSTS = "//h4[contains(text(), \'Popular Posts\')]"; //XPATH

    public List<String> listOfElementsTutorialsMenu = Arrays.asList(
            "Selenium Tutorials",
            "TestNG Tutorial",
            "JUnit Tutorial",
            "JXL Tutorial",
            "Apache POI",
            "ANT Tutorial",
            "Maven Tutorial"
    );

    public List<String> listOfElementsPopularPosts = Arrays.asList(
            "Gecko Driver Selenium 3",
            "Page Factory Pattern",
            "Execute Tests in Jenkins",
            "TestNG Custom Report",
            "Execute Selenium tests using Maven",
            "View All Selenium Tutorials"
    );

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTutorialsMenu(){
        WebElement tutorialsMetnu = findElementByXpath(TUTORIALS_MENU);
        return tutorialsMetnu;
    }

    public WebElement getPopularPosts(){
        WebElement popularPosts = findElementByXpath(TUTORIALS_MENU);
        return popularPosts;
    }



}
