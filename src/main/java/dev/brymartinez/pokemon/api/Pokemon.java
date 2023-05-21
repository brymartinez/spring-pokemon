package dev.brymartinez.pokemon.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.stream.Collectors;

public class Pokemon {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("types")
    @Expose
    public List<PokemonTypes> types;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PokemonTypes> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonTypes> types) {
        this.types = types;
    }

    public List<String> getPokemonTypes() {
        return this.types.stream()
                .map(PokemonTypes::getTypeName)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", types=" + types +
                '}';
    }
}
