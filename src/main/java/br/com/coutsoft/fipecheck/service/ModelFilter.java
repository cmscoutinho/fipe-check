package br.com.coutsoft.fipecheck.service;

import br.com.coutsoft.fipecheck.model.Data;
import br.com.coutsoft.fipecheck.model.ModelData;

import java.util.List;
import java.util.stream.Collectors;

public class ModelFilter {
    public static List<Data> queryFilter(String query, ModelData modelData) {
        return modelData.models().stream()
                .filter(model -> model.name().contains(query))
                .collect(Collectors.toList());
    }
}
