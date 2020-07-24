package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testFrames(){
        var testFramesClass = homePage.clickWYSIWYGEditor();
        testFramesClass.clearTextSpace();
        testFramesClass.typeStuff("hello ");
        testFramesClass.boldText();
        testFramesClass.typeStuff("world");
        String text = testFramesClass.getTextFromEditor();
        assertEquals(text, "hello world", "incorrect text");
    }
}
