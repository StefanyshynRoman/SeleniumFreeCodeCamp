package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;


public class FramesTest extends BaseTest {
    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBixBoxText = framesPage.getTextInBigFrame();
        String expectedBixBoxText = "This is a sample page";
        Assert.assertEquals(actualBixBoxText, expectedBixBoxText,
                "\n Actual $ Expected Text Do Not Match \n");

    }

}
