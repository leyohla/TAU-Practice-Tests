package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextBoxArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void rightClickBox(){
        WebElement context = driver.findElement(contextBoxArea);

        Actions actions = new Actions(driver);
        actions.moveToElement(context).contextClick().perform();
    }
    public String getContextBoxMsg(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
