package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContext_Menu(){
        var contextMenu = homePage.clickContextMenu();
        contextMenu.rightClickBox();
        contextMenu.getContextBoxMsg();
        String text = contextMenu.getContextBoxMsg();
        assertEquals(text, "You selected a context menu", "incorrect message");
        contextMenu.acceptAlert();
    }
}
