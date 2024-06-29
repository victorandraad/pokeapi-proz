package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    private String name;

    @JsonProperty("types")
    private List<PokeType> types;

    public String getName() {
        return name;
    }

    public String getType() {
        if (types != null && !types.isEmpty()) {
            return types.getFirst().getType().getName();
        }
        return null;
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

