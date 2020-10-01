package nt.sample.login;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        assertTrue(secureAreaPage.getAlertText().contains(
                "You logged into a secure area!"),
                "Alert text incorrect!");
    }
}
