package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPage {
    private WebDriver driver;
    private By dynamicLinkTwo = By.xpath("//a[contains(text(), 'Example 2')]");
    private By startBtn = By.xpath("//button['Start']");
    private By loadingIcon = By.id("loading");
    private By textAfterLoad = By.id("finish");

    public WaitsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickDynamicLink(){
        driver.findElement(dynamicLinkTwo).click();
    }
    public void verifyLoadingBar(){
        driver.findElement(loadingIcon).isDisplayed();
    }

    public void clickStartBtn(){
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(textAfterLoad));
    }
    public String getLoadedText(){
        return driver.findElement(textAfterLoad).getText();
    }
}
