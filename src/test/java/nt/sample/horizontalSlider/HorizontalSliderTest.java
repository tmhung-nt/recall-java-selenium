package nt.sample.horizontalSlider;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest {
    @Test
    public void testSliderByPressingArrowRight(){
        var horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.clickSlider();
        int count = 0;
        while(horizontalSlider.getSliderValue() != "4"){
            horizontalSlider.increaseSliderValueByArrowRightKey();
            if (horizontalSlider.getSliderValue().equalsIgnoreCase("4")){
                assertEquals(horizontalSlider.getSliderValue(), "4");
                break;
            }
            count=+1;
            if (count > 5){
                break;
            }
        }
    }
}
