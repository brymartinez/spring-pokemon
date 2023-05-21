package dev.brymartinez.pokemon.service;

import com.google.gson.Gson;
import dev.brymartinez.pokemon.api.Pokemon;
import dev.brymartinez.pokemon.dto.PokemonDTO;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PokemonService {

    private final OkHttpClient client = new OkHttpClient();
    private final Gson gson = new Gson();

    public Pokemon getOne(String name) throws IOException {
        Request request = new Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/" + name)
                .build();

        Response response = this.client.newCall(request).execute();

        return gson.fromJson(response.body().string(), Pokemon.class);
    }
}
