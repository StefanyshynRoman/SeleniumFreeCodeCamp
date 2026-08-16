package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;


public class ElementsPage extends HomePage {
    private By webTablesMenyItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/a/span[text()='Links']");
    private By dynamicPropertyMenuItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");
    private By textBoxMenuItem = By.xpath("//li[@id='item-0']//span[text()='Text Box']");

    public TextBoxPage clickTextBox(){
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }

    public WebTablesPage clickWebTables() {
        click(webTablesMenyItem);
        return new WebTablesPage();

    }

    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }

    public DynamicPropertyPage clickDynamicProperties() {
        scrollToElementJS(dynamicPropertyMenuItem);
        click(dynamicPropertyMenuItem);
        return new DynamicPropertyPage();
    }
}
