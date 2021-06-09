package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPage extends GenericPage{

    public static final String FOOTER = "//footer[@class=\'footer\']";
    public static final String TUTORIALS_MENU = "//h4[contains(text(), \'Tutorials Menu\')]";
    public static final String POPULAR_POSTS = "//h4[contains(text(), \'Popular Posts\')]";

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
