package demo.pages.android;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToDoDetailPage {

    public String getToDoTitle() {
        WebElement taskTitle = AndroidDriverInstance.androidDriver.findElement(By.id("task_detail_title"));

        return taskTitle.getText();
    }

    public String getToDoDescription() {
        WebElement taskDescription = AndroidDriverInstance.androidDriver.findElement(By.id("task_detail_description"));

        return taskDescription.getText();
    }
}
