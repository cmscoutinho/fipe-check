package br.com.coutsoft.fipe_check.service;

import java.util.Arrays;

public class URLBuilder {
    private final String BASE_URL_API = "https://parallelum.com.br/fipe/api/v1/";

    public String getFullURL(String ... args) {
        String fullURL = BASE_URL_API;
        if (args.length == 1){ fullURL += args[0] + "/marcas"; }
        if (args.length == 2) { fullURL += args[1] + "/"; }
        if (args.length == 3) { fullURL += "modelos/" + args[2] + "/"; }
        if (args.length == 4) { fullURL += "anos/" + args[3] + "/"; }

        return fullURL;
    }
}
