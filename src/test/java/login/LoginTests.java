package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        VerificationPage verifypage = loginPage.clickLoginBtn();
        assertTrue(verifypage.readBannerMsg().contains("You logged into a secure area!"), "this message is incorrect");
    }
}
