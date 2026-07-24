package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;


public class DynamicWaitTest extends BaseTest {
    @Test
    public void testVisibleAfterButtonText() {
        delay(2000);
        var dynamicPage=homePage.goToElements().clickDynamicProperties();

     String actualText= dynamicPage.getVisibleAfterButtonText();
     String expectedText= "Visible After 5 Seconds";
     Assert.assertEquals(actualText, expectedText,
     "\n Actual & Expected Text Do ot Match \n");
    }
}
