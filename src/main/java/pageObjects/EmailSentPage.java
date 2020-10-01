package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By staticAlert = By.id("content");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(staticAlert).getText();
    }
}
