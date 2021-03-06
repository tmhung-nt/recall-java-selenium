package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    private WebDriver driver;
    private By openModalLink = By.linkText("click here");
    private By modalTitle = By.className("modal-title");
    private By modalCloseButton = By.xpath("//p[text() = 'Close']");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openModal(){
        driver.findElement(By.cssSelector(".modal-body p"));
        driver.findElement(openModalLink);
    }

    public String getModalTitle() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(modalCloseButton));
        return driver.findElement(modalTitle).getText();
    }

    public void closeModal(){
        driver.findElement(modalCloseButton).click();
    }


}
