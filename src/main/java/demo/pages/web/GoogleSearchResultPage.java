package demo.pages.web;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultPage {

    public void clickFirstSearch() {
        WebElement firstSearch = WebDriverInstance.driver.findElement(By.xpath("//div[@id='rso']//div[1]//div[1]//div[1]//a[1]//h3[1]"));
        firstSearch.click();
    }
}
