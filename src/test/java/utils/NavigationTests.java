package utils;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickDynamicLink();
        getNewWindowManager().goBack();
        getNewWindowManager().refresh();
        getNewWindowManager().goForward();
        getNewWindowManager().goToURL("https://www.google.com/");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHereBtn();
        getNewWindowManager().switchToTab("New Window");
    }

    @Test
    public void testNewTab(){
        var newTab = homePage.clickDynamicLoadingPage();
        newTab.hoverOver();
        getNewWindowManager().switchToTab("The Internet");
        newTab.newTab("The Internet");
        newTab.verifyStartBtn();
        String text = "Dynamically Loaded Page Elements";
        assertEquals(newTab.getText(), "Dynamically Loaded Page Elements", "incorrect page text");
    }
}
