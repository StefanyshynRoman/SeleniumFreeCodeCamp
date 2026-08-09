package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility extends Utility {

    private static Actions act() {
        return new Actions(driver);
    }
    public static void dragAndDropBy(WebElement source, int x, int y){
        act().dragAndDropBy(source,x,y).perform();
    }
}
