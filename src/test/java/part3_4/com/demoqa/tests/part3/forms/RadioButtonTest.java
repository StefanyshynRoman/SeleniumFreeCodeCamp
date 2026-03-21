package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;

/**
 * @author romanpz051@gmail.com on 21.03.2026.
 * @project SeleniumFreeCodeCamp
 */
public class RadioButtonTest extends BaseTest{
    @Test
    public void testRadioButtonTest()
    {
      var formsPage =homePage.goToForms().clickPracticeForm();
      formsPage.clickFemaleRadioButton();
      boolean isFemaleRadioButtonSelected =formsPage.isFemaleSelected();
      delay(2000);
      Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female radio button is not selected \n");
    }
}
