package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    private WebDriver driver;
    private By textSpace = By.id("tinymce");
    private By boldEditor = By.id("mceu_3");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }
    public void switchToiFrame(){
        driver.switchTo().frame(0);
    }
    public void clearTextSpace(){
        switchToiFrame();
        driver.findElement(textSpace).clear();
        switchToParentFrame();
    }
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
    public void typeStuff(String text){
        switchToiFrame();
        driver.findElement(textSpace).sendKeys(text);
        switchToParentFrame();
    }
    public String getTextFromEditor(){
        switchToiFrame();
        String text = driver.findElement(textSpace).getText();
        switchToParentFrame();
        return text;
    }
    public void boldText(){
        driver.findElement(boldEditor).click();
    }
}
