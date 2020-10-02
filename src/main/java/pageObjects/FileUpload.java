package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

    private WebDriver driver;
    private WebDriverWait wait;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadResult = By.id("uploaded-files");

    public FileUpload(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
    }

    public void setInputField(String fileAbsolutePath){
        driver.findElement(inputField).sendKeys(fileAbsolutePath);
    }

    public void uploadFile(){
        driver.findElement(uploadButton).click();
    }

    public String getUploadResult(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadResult));
        return driver.findElement(uploadResult).getText();
    }
}
