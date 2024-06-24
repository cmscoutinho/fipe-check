package br.com.coutsoft.fipe_check.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIConsumer {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request;
    HttpResponse response;

    public String consume(String baseUrl) {
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI(baseUrl))
                    .build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (URISyntaxException | InterruptedException | IOException e) {
            System.out.println(e.getMessage());
        }

        return response.body().toString();
    }
}