package br.com.coutsoft.fipecheck.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter implements IDataConverter {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> TClass) {
        try {
            return mapper.readValue(json, TClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
