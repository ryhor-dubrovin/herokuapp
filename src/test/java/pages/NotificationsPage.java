package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Urls.NOTIFICATIONS_PAGE;

public class NotificationsPage extends BasePage {
    private final By CLICK_HERE_LINK = By.linkText("Click here");
    private final By NOTIFICATION = By.id("flash");

    public NotificationsPage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationsPages() {
        driver.get(NOTIFICATIONS_PAGE);
    }

    public void clickClickHereLink() {
        driver.findElement(CLICK_HERE_LINK).click();
    }

    public boolean isNotificationDisplayed() {
        return driver.findElement(NOTIFICATION).isDisplayed();
    }

    public String getNotificationText() {
        return driver.findElement(NOTIFICATION).getText();
    }
}
