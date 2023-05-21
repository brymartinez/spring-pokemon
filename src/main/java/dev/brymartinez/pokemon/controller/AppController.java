package dev.brymartinez.pokemon.controller;

import dev.brymartinez.pokemon.api.Pokemon;
import dev.brymartinez.pokemon.dto.PokemonDTO;
import dev.brymartinez.pokemon.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class AppController {

    public final PokemonService pokemonService;


    public AppController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping(path = "/pokemon")
    public PokemonDTO getPokemon(@RequestParam("name") String name) throws IOException {
        Pokemon pokemon = this.pokemonService.getOne(name);
        // TODO - candidate for pipe?
        PokemonDTO dto = new PokemonDTO();
        dto.setId(pokemon.getId());
        dto.setName(pokemon.getName());
        dto.setTypes(pokemon.getPokemonTypes());

        return dto;
    }
}
