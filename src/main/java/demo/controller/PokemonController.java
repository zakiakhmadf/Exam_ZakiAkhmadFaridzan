package demo.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PokemonController {

    public Response getPokemonByName(String pokemonName) {
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api")
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .get("/v2/pokemon/" + pokemonName);

        return response;
    }

    public Response getPokemonByNumber(int number) {
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api")
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .get("/v2/pokemon/" + number);

        return response;
    }
}
