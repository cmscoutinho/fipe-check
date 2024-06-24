package br.com.coutsoft.fipe_check.service;

public class URLBuilder {
    private final String BASE_URL_API = "https://parallelum.com.br/fipe/api/v1/";

    public String getFullURL(String veiculo, String marca, String modelo, String ano) {
        String fullURL = BASE_URL_API;
        if (veiculo != null) { fullURL += veiculo + "/"; }
        if (marca != null) { fullURL += "marcas/" + marca; }
        if (modelo != null) { fullURL += "modelos/" + modelo; }
        if (ano != null) { fullURL += "anos/" + ano; }

        return fullURL;
    }
}
