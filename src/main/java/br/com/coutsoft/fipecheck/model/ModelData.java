package br.com.coutsoft.fipecheck.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelData(@JsonAlias("modelos") List<Model> models) {

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Model model : models) {
            builder.append(model + "\n");
        }
        return builder.toString();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Model(@JsonAlias("codigo") String code,
                         @JsonAlias("nome") String name) {
        @Override
        public String toString() {
            return String.format("(%s): %s", code, name);
        }
    }
}
