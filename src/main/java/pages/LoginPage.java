package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginBtn = By.xpath("//i[@class=\'fa fa-2x fa-sign-in\']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public VerificationPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return new VerificationPage(driver);
    }
}
