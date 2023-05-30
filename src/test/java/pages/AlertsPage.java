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
    @FindBy(id = "result")
    private WebElement inputText;
    private final String FIRST_ALERT_TEXT = "I am a JS Alert";
    private final String SECOND_ALERT_TEXT = "I am a JS Confirm";
    private final String THIRD_ALERT_TEXT = "I am a JS prompt";

    public String getFirstAlertText() {
        return FIRST_ALERT_TEXT;
    }

    public String getSecondAlertText() {
        return SECOND_ALERT_TEXT;
    }

    public String getThirdAlertText() {
        return THIRD_ALERT_TEXT;
    }

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public String getInputText() {
        return inputText.getText();
    }

    public void openAlertsPage() {
        driver.get(ALERTS_PAGE);
    }

    public void clickFirstAlertButton() {
        firstAlert.click();
    }

    public void clickSecondAlertButton() {
        secondAlert.click();
    }

    public void clickThirdAlertButton() {
        thirdAlert.click();
    }

    public String acceptFirstAlert() {
        clickFirstAlertButton();
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertText;
    }

    public String cancelSecondAlert() {
        clickSecondAlertButton();
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return alertText;
    }

    public String sendTextAndAcceptThirdAlert(String text) {
        clickThirdAlertButton();
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        return alertText;
    }
}
