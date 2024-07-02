package br.com.coutsoft.fipecheck.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BrandData(@JsonAlias("codigo") String code,
                        @JsonAlias("nome") String name) {

    @Override
    public String toString() {
        return String.format("(%s): %s", code, name);
    }
}
