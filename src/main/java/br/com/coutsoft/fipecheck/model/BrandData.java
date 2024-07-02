package br.com.coutsoft.fipecheck.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BrandData(@JsonAlias("modelos") List<Brand> models) {

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Brand brand: models) {
            builder.append(brand + "\n");
        }
        return builder.toString();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private record Brand(@JsonAlias("codigo") String code,
                         @JsonAlias("nome") String name) {
        @Override
        public String toString() {
            return String.format("(%s): %s", code, name);
        }
    }
}
