package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebTablesPage extends ElementsPage {
    private By registrationAgeField = By.id("age");
    private By submitButton = By.id("submit");

    public void clickEdit(String email) {
        By edit = By.xpath("//td[text()='" + email + "']/following-sibling::td//span[@title='Edit']");
        click(edit);
    }

    public void setAge(String age) {
                      //WebElement editAge=driver.findElement(registrationAgeField);
                      //editAge.clear();
        set(registrationAgeField, age);
    }
    public void clickSubmitButton() {
        click(submitButton);
    }
}
