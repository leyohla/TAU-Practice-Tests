package dropdown;

import base.BaseTests;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown(); //can also write DropDownPage instead of var
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions(); //returns selected options as a list
        assertEquals(selectedOptions.size(), 1, "incorrect number of selections"); //ensures that only one item is selected
        assertTrue(selectedOptions.contains(option), "option not selected"); //ensures that what is selected has the text "Option 1"
    }
}
