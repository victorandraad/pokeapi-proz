package com.proz.pokeapi.usecases;

import java.io.IOException;
import java.util.ArrayList;

import com.proz.pokeapi.dto.Pokemon;
import com.proz.pokeapi.service.ApiService;

public class GetAllPokemonsUseCase {
  public ArrayList<Pokemon> execute(int pokemonQuantity) throws IOException, InterruptedException {
    if (pokemonQuantity <= 0)
      pokemonQuantity = 10;

    ApiService apiService = new ApiService();
    ArrayList<Pokemon> allPokemons = new ArrayList<Pokemon>();

    for (short i = 1; i <= pokemonQuantity; i++) {
      Pokemon pokeDto = apiService.getPokemonData(i);

      allPokemons.add(pokeDto);
    }

    return allPokemons;
  }
}
