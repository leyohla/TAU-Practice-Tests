package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SliderPage {

    private WebDriver driver;
    private By slider = By.xpath("//input[@type='range']");
    private By sliderText = By.xpath("//span[@id='range']");


    public SliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnSlider(){
        driver.findElement(slider).click();
    }

    public String numbSlider(){
        var numb = driver.findElement(sliderText).getText();
        return numb;
    }

    public String horizontalSlider(){

        while (!numbSlider().equals("4")) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);

        }
        return driver.findElement(sliderText).getText();
    }


}
