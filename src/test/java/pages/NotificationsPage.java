package pages;

import org.openqa.selenium.By;
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

    public void openNotificationsPages() {
        driver.get(NOTIFICATIONS_PAGE);
    }

    public void clickClickHereLink() {
        clickHereLink.click();
    }

    public boolean isNotificationDisplayed() {
        return notification.isDisplayed();
    }

    public String getNotificationText() {
        return notification.getText();
    }
}
