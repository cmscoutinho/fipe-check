package br.com.coutsoft.fipecheck.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelData(@JsonAlias("modelos") List<Data> models) {

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Data model : models) {
            builder.append(model + "\n");
        }
        return builder.toString();
    }
}
