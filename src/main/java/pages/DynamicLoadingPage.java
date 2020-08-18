package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//a page for the combination of hovers and waits

public class DynamicLoadingPage {
    private WebDriver driver;
    private By exampleTwo = By.xpath("//a[contains(text(), 'Example 2')]");
    private By startBtn = By.xpath("//button['Start']");
    private By textOnPage = By.xpath("//div/h3");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public void hoverOver(){
        WebElement secondExample = driver.findElement(exampleTwo);
        Actions actions = new Actions(driver);
        actions.moveToElement(secondExample).keyDown(Keys.LEFT_CONTROL).click().perform();

    }
    public void newTab(String tabTitleTab){
        var windows = driver.getWindowHandles();
        for (String window : windows){
            driver.switchTo().window(window);
            System.out.print("window name: " + window);

            if(window.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void verifyStartBtn(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(startBtn));
    }

    public String getText(){
        return driver.findElement(textOnPage).getText();
    }
}
