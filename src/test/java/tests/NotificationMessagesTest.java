package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationsPage;

import static constants.Urls.NOTIFICATIONS_PAGE;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void linkSuccessfulClickTest() {
        NotificationsPage notificationsPage = new NotificationsPage(driver);
        boolean isDisplayed = notificationsPage
                .openNotificationsPages()
                .clickClickHereLink()
                .isNotificationDisplayed();
        Assert.assertTrue(isDisplayed, "Notification isn't displayed");
        Assert.assertTrue(notificationsPage.getNotificationText().contains("Action successful"), "Incorrect notification message");
    }
}
