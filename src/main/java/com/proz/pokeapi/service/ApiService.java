package com.proz.pokeapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proz.pokeapi.dto.Pokemon;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    Pokemon pokeDTO = new Pokemon();

    public Pokemon getPokemonData(short index) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/" + index)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        pokeDTO = mapper.readValue(response.body(), Pokemon.class);
        return pokeDTO;
    }

}
