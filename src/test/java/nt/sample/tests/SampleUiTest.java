package nt.sample.tests;

import nt.sample.resources.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleUiTest extends BaseTest {
    WebDriver driver;

    public void setUp(){
        SampleUiTest sampleUiTest = new SampleUiTest();
        driver = sampleUiTest.driver;
    }

    @Test
    public void homePageTest(){
        Assert.assertEquals("The Internet", driver.getTitle());
    }
}
