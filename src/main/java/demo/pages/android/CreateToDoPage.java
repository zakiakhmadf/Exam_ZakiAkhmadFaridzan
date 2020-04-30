package demo.pages.android;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateToDoPage {

    public void inputToDoTitle(String title) {
        WebElement inputTitle = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));

        inputTitle.sendKeys(title);
    }

    public void inputToDoDescription(String description) {
        WebElement inputDescription = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_description"));

        inputDescription.sendKeys(description);
    }

    public void tapSaveToDo() {
        WebElement buttonSave = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));

        buttonSave.click();
    }
}
