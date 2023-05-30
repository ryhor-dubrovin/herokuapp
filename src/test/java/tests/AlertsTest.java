package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {
    @Test(description = "Confirm 1st alert")
    @Description("Confirm 1st alert")
    @Issue("ISS-112")
    @TmsLink("TMS-123")
    public void firstAlertConfirmTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        Assert.assertEquals(alertsPage.acceptFirstAlert(), alertsPage.getFirstAlertText(), "Wrong first alert text");
    }

    @Test(description = "Cancel 2nd alert")
    @Description("Cancel 2nd alert")
    public void secondAlertCancelTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        Assert.assertEquals(alertsPage.cancelSecondAlert(), alertsPage.getSecondAlertText(), "Wrong second alert text");
    }

    @Test(description = "Send text to 3rd alert")
    @Description("Send text to 3rd alert")
    public void thirdAlertSendTextTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        String inputText = "Hello World!";
        String alertText = alertsPage.sendTextAndAcceptThirdAlert(inputText);
        Assert.assertEquals(alertText, alertsPage.getThirdAlertText(), "Wrong third alert text");
        Assert.assertTrue(alertsPage.getInputText().contains(inputText), "Input message not displayed");
    }
}
