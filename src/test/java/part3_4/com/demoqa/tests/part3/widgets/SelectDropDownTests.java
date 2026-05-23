package part3_4.com.demoqa.tests.part3.widgets;


import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

import static com.base.BasePage.delay;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        delay(3000);
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOptions =
                selectMenuPage.getAllSelectedStandardMultiOptions();
        System.out.println(actualSelectedOptions
                .toString());
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
