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
        notificationsPage.openNotificationsPages();
        notificationsPage.clickClickHereLink();
        Assert.assertTrue(notificationsPage.isNotificationDisplayed(), "Notification isn't displayed");
        Assert.assertTrue(notificationsPage.getNotificationText().contains("Action successful"), "Incorrect notification message");
    }
}
