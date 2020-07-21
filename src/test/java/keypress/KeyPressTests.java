package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyPressTests extends BaseTests {
    @Test
    public void keyPress1(){
        var keyPage = homePage.clickKeys();
        keyPage.enterText("this is the text entered" + Keys.BACK_SPACE);
        assertEquals(keyPage.resultText(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeys();
        keyPage.enterPi();
    }
}
