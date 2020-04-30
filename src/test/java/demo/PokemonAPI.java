package demo;

import demo.controller.PokemonController;
import io.restassured.response.Response;
import org.junit.Test;

public class PokemonAPI {

    PokemonController pokemonController = new PokemonController();

    @Test
    public String getPokemonByName(String name) {

        Response response = pokemonController.getPokemonByName(name);

        response.getBody().prettyPrint();
        String pokemonName = response.path("name");
        return pokemonName;
    }

    @Test
    public Integer getPokemonByNumber(int number) {

        Response response = pokemonController.getPokemonByNumber(number);

        response.getBody().prettyPrint();
        int pokemonNumber = response.path("id");
        return pokemonNumber;
    }
}
