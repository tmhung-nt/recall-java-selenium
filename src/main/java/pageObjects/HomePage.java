package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFromAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(this.driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(this.driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(this.driver);
    }

    public KeyPresses clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPresses(this.driver);
    }

    public HorizontalSlider clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(this.driver);
    }

    public JavascritptAlerts clickJavascritptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavascritptAlerts(this.driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
