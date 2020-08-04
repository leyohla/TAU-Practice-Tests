package waits;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WaitsTests extends BaseTests {
    @Test
    public void testWaits(){
        var waitTests = homePage.clickDynamicLoading();
        waitTests.clickDynamicLink();
        waitTests.clickStartBtn();
        waitTests.verifyLoadingBar();
        String text = waitTests.getLoadedText();
        assertEquals(text, "Hello World!", "not the right text");
    }
}
