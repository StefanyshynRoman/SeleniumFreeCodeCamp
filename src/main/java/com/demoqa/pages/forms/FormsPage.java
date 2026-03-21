package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

/**
 * @author romanpz051@gmail.com on 21.03.2026.
 * @project SeleniumFreeCodeCamp
 */
public class FormsPage extends HomePage {
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        delay(2000);
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
