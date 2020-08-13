package utils;

import base.BaseTests;
import org.testng.annotations.Test;

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
}
