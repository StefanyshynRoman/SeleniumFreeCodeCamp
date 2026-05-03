package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;


public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() throws InterruptedException {
        var webTablePage = homePage.goToElements().clickWebTables();
        String expectedAge = "24";
        String email = "alden@example.com";
        Thread.sleep(3000);
        webTablePage.clickEdit(email);
        webTablePage.setAge(expectedAge);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge,"\n" +
                "Actual & Expected Ages Do Not Match\n");
    }
}
