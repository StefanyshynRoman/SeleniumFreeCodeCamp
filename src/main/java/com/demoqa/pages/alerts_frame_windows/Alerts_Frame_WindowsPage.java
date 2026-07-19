package com.demoqa.pages.alerts_frame_windows;


import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frame_WindowsPage extends HomePage {
    private By modalDialogMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
    private By browserWindowMenuItem = By.xpath("//li[@id='item-0']//span[text()='Browser Windows']");

    public FramesPage clickFrames() {
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialogMenuItem);
        click(modalDialogMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlerts() {
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public BrowserWindowsPage clickBrowserWindowsPage(){
        scrollToElementJS(browserWindowMenuItem);
        click(browserWindowMenuItem);
        return new BrowserWindowsPage();

    }

}
