package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationsPage;

public class NotificationMessagesTest extends BaseTest {

    @Test(description = "Click the link")
    @Description("Click the link")
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
