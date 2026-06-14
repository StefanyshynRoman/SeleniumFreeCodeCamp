package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;
import static utilities.SwitchToUtility.*;

@Test

public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        delay(2000);
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual $ Expected Messages Do Not Match \n ");
        acceptAlert();
    }

    public void testConfirmationAlert() {

        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        delay(2000);
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You Did not Select Cancel \n ");

    }
}
