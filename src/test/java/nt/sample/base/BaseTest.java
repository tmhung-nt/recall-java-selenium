package nt.sample.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
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
        driver.manage().window().maximize();
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
