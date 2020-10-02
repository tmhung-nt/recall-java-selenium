package nt.sample.navigation;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigationTest extends BaseTest {
    @Test
    public void testWindowNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchWindow(){
        var multipleWindowsPage = homePage.clickMultipleWindows();
        multipleWindowsPage.openNewTab();
        getWindowManager().switchToWindow("New Window");
        assertEquals(multipleWindowsPage.getPageTitle(), "New Window");

    }
}
