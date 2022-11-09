package com.ashmar32.pokemon.controller;

import com.ashmar32.pokemon.data.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/pokemon", headers = "Accept=application/json")
public class PokemonController {
    @GetMapping("")
    private List<Pokemon> catchThemAll() {
//        make up some pokemon and catch(return) them all
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1L, "Eevee", 1, 14));
        pokemons.add(new Pokemon(2L,"Clefairy", 2, 16));
        pokemons.add(new Pokemon(3L,"Squirtle", 1, 19));
        return pokemons;
    }
}
