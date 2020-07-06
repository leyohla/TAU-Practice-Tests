import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ExerciseOne {
    /* Go to our test site, the-internet, and use the findElement and findElements to complete the following scenario.

Click on the “Shifting Content” link.

     */

    public void setUp(){

    }


    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
    }


}
