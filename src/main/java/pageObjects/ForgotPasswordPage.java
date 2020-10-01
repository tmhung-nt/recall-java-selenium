package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.name("email");
    private By retrivePasswordButton = By.id("form_submit");
    private By staticAlert = By.id("content");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public String clickRetrievePasswordButton(){
        driver.findElement(retrivePasswordButton).click();
        return driver.findElement(staticAlert).getText();
    }
}
