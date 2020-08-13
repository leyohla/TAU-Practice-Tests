package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickHereBtn = By.linkText("Click Here");

    public MultipleWindowsPage (WebDriver driver){
        this.driver = driver;
    }
    public void clickHereBtn(){
        driver.findElement(clickHereBtn).click();
    }
}
