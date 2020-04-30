package demo.pages.android;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoListPage {

    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);

        // Check if the element is displayed
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public void tapAddToDo() {
        WebElement buttonAdd = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));

        buttonAdd.click();
    }

    public void tapToDoTitle() {
        WebElement toDoTitle = AndroidDriverInstance.androidDriver.findElement(By.id("title"));

        toDoTitle.click();
    }

    public void tapCheckbox() {
        WebElement checkbox = AndroidDriverInstance.androidDriver.findElement(By.id("complete"));

        checkbox.click();
    }

    public boolean checkBoxIsChecked() {
        String isChecked = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("checked");
        boolean checked = Boolean.valueOf(isChecked);
        return checked;
    }

    public boolean checkBoxIsUnchecked() {
        String isChecked = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("checked");
        boolean checked = Boolean.valueOf(isChecked);
        return checked;
    }

    public void tapMenuFilter() {
        WebElement filter = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        filter.click();
    }

    public void tapFilterByActive() {
        WebElement active = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Active')]"));
        active.click();
    }

    public String getToDoTitle() {
        WebElement toDoTitle = AndroidDriverInstance.androidDriver.findElement(By.id("title"));

        return toDoTitle.getText();
    }

    public void tapFilterByCompleted() {
        WebElement completed = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Completed')]"));
        completed.click();
    }

    public void tapNavigation() {
        WebElement navigation = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
        navigation.click();
    }

    public void tapStatistics() {
        WebElement statistics = AndroidDriverInstance.androidDriver.findElement(By.xpath("(//android.widget.CheckedTextView)[2]"));
        statistics.click();
    }

    public void tapOptions() {
        WebElement options = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']"));
        options.click();
    }

    public void tapClearCompleted() {
        WebElement clear = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Clear completed')]"));
        clear.click();
    }

    public String getNoToDo() {
        WebElement noToDo = AndroidDriverInstance.androidDriver.findElement(By.id("noTasksMain"));
        return noToDo.getText();
    }

    public void tapRefresh() {
        WebElement refresh = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Refresh')]"));
        refresh.click();
    }
}
