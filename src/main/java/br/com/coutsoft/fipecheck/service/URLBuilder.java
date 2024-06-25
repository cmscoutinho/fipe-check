package br.com.coutsoft.fipecheck.service;

public class URLBuilder {
    private final String BASE_URL_API = "https://parallelum.com.br/fipe/api/v1/";

    public String getFullURL(String ... args) {
        String fullURL = BASE_URL_API;
        String[] suffixes = {"/marcas/", "/modelos/", "/anos/", "/"};

        for (int i = 0; i < args.length; i++) {
            fullURL += args[i] + suffixes[i];
        }

        return fullURL;
    }
}
