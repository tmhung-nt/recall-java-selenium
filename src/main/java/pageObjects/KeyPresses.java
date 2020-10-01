package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPresses(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }

}
