package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;


public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        delay(2000);
        var modalDialogsPage = afwPage.clickModalDialogs();
        delay(2000);
        modalDialogsPage.clickSmallModalButton();
       String actualText= modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\n Small modal text not found \n");
        modalDialogsPage.clickCloseButton();

    }
}
