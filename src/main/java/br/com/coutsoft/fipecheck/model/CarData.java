package br.com.coutsoft.fipecheck.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CarData(@JsonAlias("Valor") String price,
                      @JsonAlias("Marcar") String brand,
                      @JsonAlias("Modelo") String model,
                      @JsonAlias("AnoModelo") int year) {
}
