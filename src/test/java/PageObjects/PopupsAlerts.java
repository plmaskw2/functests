package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupsAlerts extends GenericPage {

    private static final String WELCOME_POPUP = "image-darkener"; // by ID
    private static final String WELCOME_POPUP_CLOSE = "at-cv-lightbox-close"; // by ID

    public PopupsAlerts(WebDriver driver) {
        super(driver);
    }

    public PopupsAlerts closeWelcomePopup() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(findElementByID(WELCOME_POPUP)));
        findElementByID(WELCOME_POPUP_CLOSE).click();
        return this;
    }
}
