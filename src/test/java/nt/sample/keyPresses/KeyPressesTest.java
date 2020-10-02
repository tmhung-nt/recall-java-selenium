package nt.sample.keyPresses;

import utils.CommonUtils;
import nt.sample.base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTest {
    @Test
    public void testPressBlackSpace(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("a" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResultText(), "You entered: BACK_SPACE", "Press key is not BACK_SPACE!");
    }

    @Test
    public void testPressPi(){
        var keyPressesPage = homePage.clickKeyPresses();
        switch (CommonUtils.getOS()){
            case LINUX:
                keyPressesPage.enterText(Keys.chord(Keys.ALT, "P") + "=3.14");
                break;
            case WINDOWS:
                keyPressesPage.enterText(Keys.chord(Keys.ALT, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD7) + "=3.14");
                break;
        }
        assertEquals(keyPressesPage.getResultText(), "You entered: 4", "Press key is not  4!");
    }
}
