package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HoversPage {
    private WebDriver driver;
    By figureBox = By.className("figure");
    By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);

        Actions action = new Actions(this.driver);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption {
        private WebElement boxCaption;
        private By captionTitle = By.tagName("h5");
        private By captionLink = By.tagName("a");

        public FigureCaption(WebElement boxCaption){
            this.boxCaption = boxCaption;
        }

        public String getCaptionTitle(){
            return this.boxCaption.findElement(captionTitle).getText();
        }

        public boolean isDisplayed(){
            return this.boxCaption.isDisplayed();
        }

        public String getCaptionLink(){
            return this.boxCaption.findElement(captionLink).getAttribute("href");
        }
    }
}
