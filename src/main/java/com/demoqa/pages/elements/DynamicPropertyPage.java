package com.demoqa.pages.elements;


import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertyPage extends ElementsPage {
    private By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText() {
        //delay(2000);
        explicitWaitUntilVisible(10, visibleAfterButton);
        String visibleText = getText(visibleAfterButton);
        System.out.println("Button Text: " + visibleText);
        return visibleText;
    }
}
