package br.com.coutsoft.fipe_check.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIConsumer {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request;
    HttpResponse response;
    private final String URL_API = "https://parallelum.com.br/fipe/api/v1/carros/marcas";

    public String consume() {
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI(URL_API))
                    .build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (URISyntaxException | InterruptedException | IOException e) {
            System.out.println(e.getMessage());
        }

        return response.body().toString();
    }
}
