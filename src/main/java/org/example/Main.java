package org.example;

import org.example.dto.Pokemon;
import org.example.service.ApiService;

import java.io.IOException;

public class Main {

    static short pokemonQuantity = 1023;

    public static void main(String[] args) throws IOException, InterruptedException {
        ApiService apiService = new ApiService();
        for(short i = 1; i < pokemonQuantity; i++) {
            Pokemon pokeDto = apiService.getPokemonData(i);
            System.out.println(pokeDto.getName());
            System.out.println(pokeDto.getType());
            System.out.println("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + i + ".png");
        }
   }
}