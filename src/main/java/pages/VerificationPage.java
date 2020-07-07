package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationPage {

    private WebDriver driver;
    private By banner = By.id("flash");

    public VerificationPage(WebDriver driver){
        this.driver = driver;
    }

    public String readBannerMsg(){
        return driver.findElement(banner).getText();
    }
}
