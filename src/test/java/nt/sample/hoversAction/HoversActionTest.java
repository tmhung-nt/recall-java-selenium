package nt.sample.hoversAction;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversActionTest extends BaseTest {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isDisplayed(), "Caption is not displayed!");
        assertTrue(caption.getCaptionLink().endsWith("/users/1"), "Caption link text is incorrect!");
        assertEquals(caption.getCaptionTitle(), "name: user1", "caption title is incorrect!");
    }

    @Test
    public void testHoverUser3(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(3);

        assertTrue(caption.isDisplayed(), "Caption is not displayed!");
        assertTrue(caption.getCaptionLink().endsWith("/users/3"), "Caption link text is incorrect!");
        assertEquals(caption.getCaptionTitle(), "name: user3", "caption title is incorrect!");
    }
}
