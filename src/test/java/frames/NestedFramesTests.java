package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {
    @Test
    public void testFrames(){
        var testFrames = homePage.clickNestedFrames();
        testFrames.clickFrameTag();
        String text = testFrames.clickLeftFrame();
        assertEquals(text, "LEFT", "not left");
        String textTwo = testFrames.clickBottomFrame();
        assertEquals(textTwo, "BOTTOM", "not bottom");
    }
}
