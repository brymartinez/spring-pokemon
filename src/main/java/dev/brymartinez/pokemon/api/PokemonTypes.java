package dev.brymartinez.pokemon.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class PokemonTypes {
    @SerializedName("slot")
    @Expose
    public Integer slot;
    @SerializedName("type")
    @Expose
    public PokemonType type;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public String getTypeName() {
        return this.type.getName();
    }

    @Override
    public String toString() {
        return "PokemonTypes{" +
                "slot=" + slot +
                ", type=" + type +
                '}';
    }


}
