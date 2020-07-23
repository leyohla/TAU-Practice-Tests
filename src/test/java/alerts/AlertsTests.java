package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testJSAlertsPage(){
        var alertsPage = homePage.clickAlert();
        alertsPage.jsAlert();
        String text = alertsPage.alertText();
        assertEquals(text, "I am a JS Alert", "alert msg incorrect");
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "wrong result");
    }
    @Test
    public void testJSConfirmPage(){
        var alertsPage = homePage.clickAlert();
        alertsPage.jsConfirm();
        String text = alertsPage.alertText();
        assertEquals(text, "I am a JS Confirm", "confirm msg incorrect");
        alertsPage.dismissAlert();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Cancel was not clicked");

    }
    @Test
    public void testJSPromptPage(){
        var alertsPage = homePage.clickAlert();
        alertsPage.jsPromptTrigger();
        String text = alertsPage.alertText();
        assertEquals(text, "I am a JS prompt", "prompt msg incorrect");
        alertsPage.enterPromptText();
        alertsPage.acceptAlert();
        String returnedText = alertsPage.getResult();
        assertEquals(returnedText, "You entered: correct", "wrong word entered");
    }
}
