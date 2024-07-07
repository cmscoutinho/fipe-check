package br.com.coutsoft.fipecheck.service;

import java.util.List;

public interface IDataConverter {
    public <T> T getData(String json, Class<T> TClass);

    public <T> List<T> getList(String json, Class<T> TClass);
}
