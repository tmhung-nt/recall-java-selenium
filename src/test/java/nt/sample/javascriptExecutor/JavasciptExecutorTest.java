package nt.sample.javascriptExecutor;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class JavasciptExecutorTest extends BaseTest {
    @Test
    public void testScrollToTable(){
        var largeAndDeepDom = homePage.clickLargeAndDeepDom();
        largeAndDeepDom.scrollToTable();

    }

    @Test
    public void testInfinityScroll(){
        var infinity = homePage.clickInfiniteScroll();
        infinity.scrollToParagraph(5);
        assertTrue(infinity.getNumberOfParagraphs() == 5);
    }
}
