package nt.sample.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import lib.Util;
import pageObjects.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        switch(Util.getOS()){
            case WINDOWS:
                break;
            case LINUX:
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        }
        
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
