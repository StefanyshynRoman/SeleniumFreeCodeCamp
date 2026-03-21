package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

/**
 * @author romanpz051@gmail.com on 21.03.2026.
 * @project SeleniumFreeCodeCamp
 */
public class HomePage extends BasePage {
    private By formsCard= By.xpath("//div[@id='root']//h5[text()='Forms']");

    public FormsPage goToForms(){
        delay(2000);
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();

    }
}
