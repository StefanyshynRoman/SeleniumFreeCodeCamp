package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.alerts_frame_windows.Alerts_Frame_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='root']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='root']//h5[text()='Elements']");
    private By widgesCard = By.xpath("//div[@id='root']//h5[text()='Widgets']");
    private By alertsFrameWindowsCard = By.xpath("//div[@id='root']//h5[contains(text(), 'Alerts')]");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgesCard);
        click(widgesCard);
        return new WidgetsPage();
    }

    public Alerts_Frame_WindowsPage goToAlertsFramesWindowsCard() {
        scrollToElementJS(alertsFrameWindowsCard);
        click(alertsFrameWindowsCard);
        return new Alerts_Frame_WindowsPage();
    }
}
