package nt.sample.forgotPassword;

import nt.sample.base.BaseTest;
import pageObjects.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void testRetrievePasswordViaMailSuccessfully(){
        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();

        forgotPassword.setEmailField("email@gmail.com");
        EmailSentPage emailSentPage = forgotPassword.clickRetrievePasswordButton();
;
        assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"), "Alert text is invalid!");
    }
}
