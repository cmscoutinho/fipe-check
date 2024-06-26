package br.com.coutsoft.fipecheck.service;

public interface IDataConverter {
    <T> T getData(String json, Class<T> TClass);
}
