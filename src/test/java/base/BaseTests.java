package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowsManager;

import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.List;
import java.util.Set;

public class BaseTests {
    /* Exercise 1:

    Go to our test site, the-internet, and use the findElement and findElements to complete the following scenario.

    Click on the “Shifting Content” link.
    Then click on the first example Menu Element.
    Then print how many of these menu elements appear.

     */

    WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        goHome();
        deleteCookies();
        //setCookie();
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        homePage = new HomePage(driver); //provides a handle in the test layer to the application

        /* Practice exercise:

        WebElement link = driver.findElement(By.linkText("Shifting Content"));
        link.click();
        WebElement menuContents = driver.findElement(By.xpath(("//a[text()='Example 1: Menu Element']")));
        menuContents.click();
        List<WebElement> menuLinks = driver.findElements(By.tagName("li"));
        System.out.println(menuLinks.size());

        */
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    //we do not need a main method anymore because the TestNG annotations give an order in which to run the tests (before, test, after)
    /*
    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
        test.tearDown();
    }*/

    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult result){

        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            screenshot.getPath();

            try{
                Files.move(screenshot, new File("src/main/resources/screenshots/" + result.getName() + ".png"));

            }catch(IOException e){
                System.out.print("no");
                e.printStackTrace();
            }
        }
    }

    public WindowsManager getNewWindowManager(){
        return new WindowsManager(driver);
    }

    public ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123").domain("the-internet.herokuapp.com").build();

        Set cookies = driver.manage().getCookies();
        System.out.print("Cookies found: " + cookies);
    }
    private void deleteCookies(){

        //driver.manage().deleteCookieNamed("optimizelyBuckets");
        driver.manage().deleteAllCookies();
        Set cookies = driver.manage().getCookies();
        System.out.print(cookies);

    }
}
