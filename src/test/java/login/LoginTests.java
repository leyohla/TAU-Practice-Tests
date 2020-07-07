package login;

import base.BaseTests;
import pages.LoginPage;
import pages.VerificationPage;

public class LoginTests extends BaseTests {

    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        VerificationPage verifypage = loginPage.clickLoginBtn();
        verifypage.readBannerMsg();
    }
}
