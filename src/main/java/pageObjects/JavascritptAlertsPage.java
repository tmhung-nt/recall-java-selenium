package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascritptAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.cssSelector("button[onclick='jsAlert()']");
    private By triggerConfirmButton = By.cssSelector("button[onclick='jsConfirm()']");
    private By triggerPromptButton = By.cssSelector("button[onclick='jsPrompt()']");
    private By result = By.id("result");

    public JavascritptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_inputText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
