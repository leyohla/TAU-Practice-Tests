package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    /* Exercise 1:

    Go to our test site, the-internet, and use the findElement and findElements to complete the following scenario.

    Click on the “Shifting Content” link.
    Then click on the first example Menu Element.
    Then print how many of these menu elements appear.

     */

    WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        homePage = new HomePage(driver); //provides a handle in the test layer to the application

        WebElement link = driver.findElement(By.linkText("Shifting Content"));
        link.click();
        WebElement menuContents = driver.findElement(By.xpath(("//a[text()='Example 1: Menu Element']")));
        menuContents.click();
        List<WebElement> menuLinks = driver.findElements(By.tagName("li"));
        System.out.println(menuLinks.size());
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}