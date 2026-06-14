package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frame_WindowsPage {
    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult =By.id("confirmResult");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }
    public void clickConfirmationAlertButton() {
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

}
