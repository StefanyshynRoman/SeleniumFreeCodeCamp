package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;


public class ElementsPage extends HomePage {
    private By webTablesMenyItem= By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    public WebTablesPage clickWebTables(){
        click(webTablesMenyItem);
        return new WebTablesPage();

    }

}
