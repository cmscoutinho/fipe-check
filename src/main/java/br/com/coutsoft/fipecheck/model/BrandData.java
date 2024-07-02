package br.com.coutsoft.fipecheck.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BrandData(@JsonAlias("modelos") List<Brand> models) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    private record Brand(@JsonAlias("codigo") String code,
                         @JsonAlias("nome") String name) {}


}
