package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    //extract all text from option field and store this as a list (I wrote this!!):
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements =
                findDropDownElement().getAllSelectedOptions();
        List<String> selectElement = new ArrayList<>();

        for (WebElement i:selectedElements) {
            selectElement.add(i.getText());
        }
        return selectElement;

        //for every element inside of this list, we want it to take this action [lambda] of getting the text of every element.
        //Then collect each of those elements into a new list of strings.
        //could also have looped through each element in the list and added each element to a new list.

        //return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());

    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

}
