package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;

@Test
public class DynamicWaitTest extends BaseTest {

    public void testVisibleAfterButtonText() {
        delay(2000);
        var dynamicPage = homePage.goToElements().clickDynamicProperties();

        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText,
                "\n Actual & Expected Text Do ot Match \n");
    }


    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue,
                "\n Actual & Expected Value Do ot Match (100%) \n");

    }

}
