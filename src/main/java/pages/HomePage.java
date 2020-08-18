package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeys(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public SliderPage clickSlider(){
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }
    public AlertsPage clickAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public FramesPage clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new FramesPage(driver);
    }
    public NestedFramesPage clickNestedFrames(){
        clickLink("Frames");
        return new NestedFramesPage(driver);
    }
    public WaitsPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new WaitsPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
}
