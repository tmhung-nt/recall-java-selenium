package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrame {
    private WebDriver driver;
    private String frameTop = "frame-top";
    private String frameBottom = "frame-bottom";
    private String frameLeft = "frame-left";
    private By frameSet = By.tagName("frameset");
    private By frameBody = By.tagName("body");

    public NestedFrame(WebDriver driver) {
        this.driver=driver;
    }

    public String getTextLeftFrame(){
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameLeft);
        String text = driver.findElement(frameBody).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getTextBottomFrame(){
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame(driver.findElement(frameSet));
        driver.switchTo().frame(frameBottom);
        String text = driver.findElement(frameBody).getText();
        driver.switchTo().parentFrame();
        return text;
    }
}
