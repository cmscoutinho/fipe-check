package br.com.coutsoft.fipecheck.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CarData(@JsonAlias("Valor") String price,
                      @JsonAlias("Marca") String brand,
                      @JsonAlias("Modelo") String model,
                      @JsonAlias("AnoModelo") Integer year,
                      @JsonAlias("Combustivel") String fuelType) {

    @Override
    public String toString() {
        return String.format("Model: %s\nBrand: %s\nYear: %d\nPrice: %s", model, brand, year, price);
    }
}
