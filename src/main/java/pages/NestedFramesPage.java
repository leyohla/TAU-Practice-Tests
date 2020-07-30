package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;
    //private By leftText = By.xpath("//body[contains(text(),'LEFT')]");
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickFrameTag(){
        driver.findElement(By.linkText("Nested Frames")).click();
    }
    public void switchToFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
    }
    public void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }

    public void exitFrame(){
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public String clickLeftFrame(){
        switchToFrame();
        String text = driver.findElement(body).getText();
        exitFrame();
        return text;
    }
    public String clickBottomFrame(){
        switchToBottomFrame();
        String text = driver.findElement(body).getText();
        exitFrame();
        return text;
    }
}
