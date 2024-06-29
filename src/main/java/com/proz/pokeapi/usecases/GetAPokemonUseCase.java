package com.proz.pokeapi.usecases;

import com.proz.pokeapi.dto.Pokemon;
import com.proz.pokeapi.service.ApiService;

import java.io.IOException;

public class GetAPokemonUseCase {
    public Pokemon execute(short index) throws IOException, InterruptedException {
        ApiService apiService = new ApiService();

        Pokemon pokeDto = apiService.getPokemonData(index);

        return pokeDto;
    }
}
