package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By paragraphBlock = By.className("jscroll-added");
    private JavascriptExecutor jsExecutor;

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
        jsExecutor = (JavascriptExecutor)driver;
    }

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight);";
        while (getNumberOfParagraphs() < index){
            jsExecutor.executeScript(script);
        }

    }

    public int getNumberOfParagraphs() {
        return driver.findElements(paragraphBlock).size();
    }

}
