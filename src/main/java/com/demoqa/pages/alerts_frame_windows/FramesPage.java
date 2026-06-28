package com.demoqa.pages.alerts_frame_windows;


import org.openqa.selenium.By;

public class FramesPage extends  Alerts_Frame_WindowsPage{
   private By textInFrame = By.id("sampleHeading");
   public String getTextInBigFrame(){
       String bigFrameText=find(textInFrame).getText();
       System.out.println("Big Frame Text: "+bigFrameText);
       return bigFrameText;

   }
}
