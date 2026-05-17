package com.demoqa.pages.widgets;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {
    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        Select select = new Select(find(standardMultiSelect));
        select.selectByContainsVisibleText(text);
    }
}
