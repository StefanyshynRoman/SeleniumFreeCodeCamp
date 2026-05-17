package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility extends Utility {
    private static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text) {
        findDropDown(locator).selectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int index) {
        findDropDown(locator).selectByIndex(index);
    }

    public static void selectByValue(By locator, String index) {
        findDropDown(locator).selectByValue(index);
    }
    public static void deselectByValue(By locator, String index) {
        findDropDown(locator).deselectByValue(index);
    }
}
