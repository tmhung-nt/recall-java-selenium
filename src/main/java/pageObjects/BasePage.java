package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public static WebDriver edriver;
    public static WebDriverWait wait=new WebDriverWait(edriver, 5);;

    public static int WAIT_TIMEOUT_SECONDS=10;

    public static void setDriver(WebDriver driver){
        edriver = driver;
    }

    public static void waitUntilElementIsVisible(By locator) throws Exception{
        waitWhileBrowserIsBusy();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitWhileBrowserIsBusy() throws Exception {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                return executor.executeScript("return document.readyState").equals("complete");
            }
        };

        Wait<WebDriver> wait = new WebDriverWait(edriver, WAIT_TIMEOUT_SECONDS);
        try {
            wait.until(expectation);
        } catch (Throwable t) {
            System.out.println("Browser did not responded in " + WAIT_TIMEOUT_SECONDS
                    + " sec(s)");
        }

    }
}
