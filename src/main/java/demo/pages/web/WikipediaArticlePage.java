package demo.pages.web;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WikipediaArticlePage {

    public String getPokemonName() {
        WebElement pokemonName = WebDriverInstance.driver.findElement(By.id("firstHeading"));
        return pokemonName.getText();
    }

    public String getPokemonNumber() {
        WebElement pokemonId = WebDriverInstance.driver.findElement(By.xpath("//table[@class='infobox']//tbody//tr//th//table//tbody//tr//td//center//big//b//abbr"));
        return pokemonId.getText();
    }
}
