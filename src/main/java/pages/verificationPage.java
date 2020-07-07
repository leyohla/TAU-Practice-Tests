package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verificationPage {

    private WebDriver driver;
    private By banner = By.id("flash");

    public verificationPage(WebDriver driver){
        this.driver = driver;
    }

    public String readBannerMsg(WebDriver driver){
        return driver.findElement(banner).getText();
    }
}
