package nt.sample.alerts;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.JavascritptAlerts;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest {
    @Test
    public void testAcceptAlert(){
        var jsAlertPage = homePage.clickJavascritptAlerts();
        jsAlertPage.triggerAlert();
        assertEquals(jsAlertPage.alert_getText(), "I am a JS Alert", "Alert text is incorrect!");
        jsAlertPage.alert_clickToAccept();
        assertEquals(jsAlertPage.getResult(), "You successfuly clicked an alert", "Result text is incorrect!");
    }

    @Test
    public void testDismissAlert(){
        var jsAlertPage = homePage.clickJavascritptAlerts();
        jsAlertPage.triggerConfirm();
        assertEquals(jsAlertPage.alert_getText(), "I am a JS Confirm", "Alert Confirm text is incorrect!");

        jsAlertPage.alert_clickToDismiss();
        assertEquals(jsAlertPage.getResult(), "You clicked: Cancel", "Result text is incorrect!");
    }

    @Test
    public void testInputTextToPrompt(){
        var jsAlertPage = homePage.clickJavascritptAlerts();
        jsAlertPage.triggerPrompt();
        assertEquals(jsAlertPage.alert_getText(), "I am a JS prompt", "Alert Prompt text is incorrect!");

        String textToInput = "hello";
        jsAlertPage.alert_inputText(textToInput);

        jsAlertPage.alert_clickToAccept();
        assertEquals(jsAlertPage.getResult(), "You entered: " + textToInput, "Result text is incorrect!");
    }

}
