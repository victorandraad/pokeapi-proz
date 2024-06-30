package com.proz.pokeapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    private String name;
    private List<PokeType> types;
    private String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setTypes(List<PokeType> types) {
        this.type = types.get(0).getType().getName();
        this.types = null;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PokeType {
        private Slot type;

        public Slot getType() {
            return type;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Slot {
        private String name;

        public String getName() {
            return name;
        }

    }
}
