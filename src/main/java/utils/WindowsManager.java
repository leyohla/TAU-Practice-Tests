package utils;

import org.openqa.selenium.WebDriver;

public class WindowsManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void refresh(){
        navigate.refresh();
    }
    public void goForward(){
        navigate.forward();
    }
    public void goToURL(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

        System.out.print("Number of tabs: " + windows.size() );

        System.out.print("Window handles: ");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
