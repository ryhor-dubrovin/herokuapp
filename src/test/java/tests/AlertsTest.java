package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {
    @Test
    public void firstAlertConfirmableTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickFirstAlert();
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(alertText, alertsPage.FIRST_ALERT_TEXT, "Wrong first alert text");
    }
}
