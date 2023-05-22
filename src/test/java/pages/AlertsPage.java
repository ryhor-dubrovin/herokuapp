package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.ALERTS_PAGE;

public class AlertsPage extends BasePage {
    @FindBy(css = "[onclick='jsAlert()']")
    private WebElement firstAlert;
    @FindBy(css = "[onclick='jsConfirm()']")
    private WebElement secondAlert;
    @FindBy(css = "[onclick='jsPrompt()']")
    private WebElement thirdAlert;
    public final String FIRST_ALERT_TEXT = "I am a JS Alert";
    public final String SECOND_ALERT_TEXT = "I am a JS Confirm";
    public final String THIRD_ALERT_TEXT = "I am a JS prompt";

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(ALERTS_PAGE);
    }

    public void clickFirstAlert() {
        firstAlert.click();
    }

    public void clickSecondAlert() {
        secondAlert.click();
    }

    public void clickThirdAlert() {
        thirdAlert.click();
    }
}
