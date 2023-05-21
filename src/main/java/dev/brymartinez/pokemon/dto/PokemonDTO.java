package dev.brymartinez.pokemon.dto;

import java.util.List;

public class PokemonDTO {
    public Integer id;
    public String name;
    public List<String> types;

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

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "PokemonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", types=" + types +
                '}';
    }
}
