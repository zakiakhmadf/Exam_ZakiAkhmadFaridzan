package demo.pages.android;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StatisticsPage {

    public String getMenuTitle() {
        WebElement title = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Statistics')]"));
        return title.getText();
    }
}
