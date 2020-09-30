package nt.sample.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(375, 812));
        WebElement brokenImageLink = driver.findElement(By.linkText("Broken Images"));
        brokenImageLink.click();
        System.out.println(driver.getTitle());

        driver.navigate().back();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        driver.findElement(By.linkText("Shifting Content")).click();
        System.out.println(driver.findElements(By.tagName("a")).size());

        driver.close();
    }

    public void tearDown(){
        driver.close();
    }

    public static void main(String args[]){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}
