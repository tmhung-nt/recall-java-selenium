package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider {
    private WebDriver driver;
    private By sliderLocator = By.tagName("input");
    private By sliderValue = By.id("range");
    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSlider(){
        driver.findElement(sliderLocator).click();
    }

    public void increaseSliderValueByArrowRightKey(){
        driver.findElement(sliderLocator).sendKeys(Keys.ARROW_RIGHT);
    }

    public void decreaseSliderValueByArrowLeftKey(){
        driver.findElement(sliderLocator).sendKeys(Keys.ARROW_LEFT);
    }

    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }

}
