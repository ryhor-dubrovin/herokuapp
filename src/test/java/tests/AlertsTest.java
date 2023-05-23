package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {
    @Test
    public void firstAlertConfirmTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        Assert.assertEquals(alertsPage.acceptFirstAlert(), alertsPage.getFirstAlertText(), "Wrong first alert text");
    }

    @Test
    public void secondAlertCancelTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        Assert.assertEquals(alertsPage.cancelSecondAlert(), alertsPage.getSecondAlertText(), "Wrong second alert text");
    }

    @Test
    public void thirdAlertSendTextTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        String inputText = "Hello World!";
        String alertText = alertsPage.sendTextAndAcceptThirdAlert(inputText);
        Assert.assertEquals(alertText, alertsPage.getThirdAlertText(), "Wrong third alert text");
        Assert.assertTrue(alertsPage.getInputText().contains(inputText), "Input message not displayed");
    }
}
