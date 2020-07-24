package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//sending the absolute path file to the input in the form online

public class FileUploadPage {
    private WebDriver driver;
    private By uploadBtn = By.id("file-submit");
    private By inputField = By.id("file-upload");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadBtn(){
        driver.findElement(uploadBtn).click();
    }
    public void uploadFile(String absolutePathFile){
        driver.findElement(inputField).sendKeys(absolutePathFile);
    }
}
