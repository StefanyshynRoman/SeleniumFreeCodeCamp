package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;


public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert(){
       var alertsPage= homePage.goToAlertsFramesWindowsCard().clickAlerts();
    }
}
