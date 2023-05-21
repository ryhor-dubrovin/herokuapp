package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.NOTIFICATIONS_PAGE;

public class NotificationsPage extends BasePage {
    @FindBy(linkText = "Click here")
    private WebElement clickHereLink;
    @FindBy(id = "flash")
    private WebElement notification;

    public NotificationsPage(WebDriver driver) {
        super(driver);
    }

    public NotificationsPage openNotificationsPages() {
        driver.get(NOTIFICATIONS_PAGE);
        return this;
    }

    public NotificationsPage clickClickHereLink() {
        clickHereLink.click();
        return this;
    }

    public boolean isNotificationDisplayed() {
        return notification.isDisplayed();
    }

    public String getNotificationText() {
        return notification.getText();
    }
}
