package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SliderTests extends BaseTests {

    @Test
    public void horizontalSlide(){
        var slidePage = homePage.clickSlider();
        slidePage.clickOnSlider();
        slidePage.horizontalSlider();
        assertEquals(slidePage.horizontalSlider(), "4", "expected number incorrect");
    }
}
