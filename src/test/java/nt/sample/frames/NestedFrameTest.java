package nt.sample.frames;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NestedFrameTest extends BaseTest {
    @Test
    public void testNestedFrame(){
        var nestedFrame = homePage.clickNestedFrame();
        assertTrue(nestedFrame.getTextLeftFrame().contains("LEFT"));
        assertTrue(nestedFrame.getTextBottomFrame().contains("BOTTOM"));

    }
}
