package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {
    private WebDriver driver;
    private By jsAlertTrigger = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmTrigger = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromptTrigger = By.xpath("//button[text()='Click for JS Prompt']");

    private By results = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void jsAlert(){
        driver.findElement(jsAlertTrigger).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept(); //switches from the dom
    }
    public String getResult(){
        return driver.findElement(results).getText();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String alertText(){
        return driver.switchTo().alert().getText();
    }
    public void jsConfirm(){
        driver.findElement(jsConfirmTrigger).click();
    }
    public void jsPromptTrigger(){
        driver.findElement(jsPromptTrigger).click();
    }
    public void enterPromptText(){
        driver.switchTo().alert().sendKeys("correct");
    }

}
