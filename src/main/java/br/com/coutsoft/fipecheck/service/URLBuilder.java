package br.com.coutsoft.fipecheck.service;

public class URLBuilder {
    private final String BASE_URL_API = "https://parallelum.com.br/fipe/api/v1/";

    public String getFullURL(String ... args) {
        String fullURL = BASE_URL_API;
        if (args.length >= 1) { fullURL += args[0] + "/marcas/"; }
        if (args.length >= 2) { fullURL += args[1] + "/modelos/"; }
        if (args.length >= 3) { fullURL += args[2] + "/anos/"; }
        if (args.length >= 4) { fullURL += args[3] + "/"; }

        return fullURL;
    }
}
