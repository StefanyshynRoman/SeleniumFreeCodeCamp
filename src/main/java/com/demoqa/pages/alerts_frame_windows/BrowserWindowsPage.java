package com.demoqa.pages.alerts_frame_windows;


import org.openqa.selenium.By;

import java.util.Set;

import static utilities.GetUtility.*;
import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frame_WindowsPage {
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        //Step 1: Get The Current "Main" Window Handle
        String currentHandle = getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");
        // Step 2: Get All Window Handles
        Set<String> allHandles = getWindowHandles();
        System.out.println(" # of open Windows: " + allHandles.size());
        //Step 3: Switch To The New Window Using The Window Handle
        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st Window ID: " + handle);
            } else {
                //driver.switchTo().window(handle);
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }


    }
}
