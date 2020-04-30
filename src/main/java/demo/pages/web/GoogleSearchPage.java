package demo.pages.web;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    public void openGoogleSearchPage() {
        WebDriverInstance.driver.get("https://www.google.com");
    }

    public void inputSearch(String keyword) {
        WebElement inputSearch = WebDriverInstance.driver.findElement(By.xpath("//input[@name='q']"));
        inputSearch.sendKeys(keyword);
    }

    public void clickSearch() {
        WebElement buttonSearch = WebDriverInstance.driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
        buttonSearch.click();
    }
}
