package demo.steps.web;

import demo.PokemonAPI;
import demo.pages.web.GoogleSearchPage;
import demo.pages.web.GoogleSearchResultPage;
import demo.pages.web.WikipediaArticlePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebStepDefinition {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage();
    WikipediaArticlePage wikipediaArticlePage = new WikipediaArticlePage();
    PokemonAPI pokemonAPI = new PokemonAPI();

    @Given("User open google page")
    public void userOpenGooglePage() {
        googleSearchPage.openGoogleSearchPage();
    }

    @When("User input keyword {string} on the search field")
    public void userInputKeywordOnTheSearchField(String keyword) {
        googleSearchPage.inputSearch(keyword);
    }

    @When("User click search button")
    public void userClickSearchButton() {
        googleSearchPage.clickSearch();
    }

    @When("User click the first search")
    public void userClickTheFirstSearch() {
        googleSearchResultPage.clickFirstSearch();
    }

//    @Then("User see {string} as the title on wikipedia article page")
//    public void userSeeAsTheTitleOnWikipediaArticlePage(String name) {
//        String actualName = wikipediaArticlePage.getPokemonName();
//        Assert.assertEquals(name, actualName);
//    }
//
//    @Then("User see {string} as the pokemon number on wikipedia article page")
//    public void userSeeAsThePokemonNumberOnWikipediaArticlePage(String number) {
//        String actualNumber = wikipediaArticlePage.getPokemonNumber();
//        Assert.assertEquals(number, actualNumber);
//    }

    @Then("User see {string} as the title on wikipedia article page")
    public void userSeeAsTheTitleOnWikipediaArticlePage(String name) {
        String nameFromAPI = pokemonAPI.getPokemonByName(name);
        String nameFromArticle = wikipediaArticlePage.getPokemonName().toLowerCase();
        Assert.assertEquals(nameFromAPI, nameFromArticle);
    }

    @Then("User see {int} as pokemon number on wikipedia article page")
    public void userSeeOnWikipediaArticlePage(int number) {
        String numberFromAPI = pokemonAPI.getPokemonByNumber(number).toString();
        String numberFromArticle = wikipediaArticlePage.getPokemonNumber();
        Assert.assertEquals(numberFromAPI, numberFromArticle);
    }
}
