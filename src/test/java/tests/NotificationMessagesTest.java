package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static constants.Urls.NOTIFICATIONS_PAGE;

public class NotificationMessagesTest extends BaseTest{

    @Test
    public void linkSuccessfulClickTest() {
        driver.get(NOTIFICATIONS_PAGE);
        driver.findElement(By.linkText("Click here")).click();

        WebElement notification = driver.findElement(By.id("flash"));
        Assert.assertTrue(notification.isDisplayed(),"Notification isn't displayed");
        String notificationText = notification.getText();
        Assert.assertTrue(notificationText.contains("Action successful"),"Incorrect notification message");
    }
}
