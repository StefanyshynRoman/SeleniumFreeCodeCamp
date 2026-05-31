package part3_4.com.demoqa.tests.part4.screenshot;


import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenShotTest extends BaseTest {
    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormPage =homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();

    }
}
