package br.com.coutsoft.fipe_check.main;

import br.com.coutsoft.fipe_check.service.APIConsumer;
import br.com.coutsoft.fipe_check.service.URLBuilder;

public class Main {
    public static void main(String[] args) {

        String veiculo = "carros";

        APIConsumer consumer = new APIConsumer();
        URLBuilder builder = new URLBuilder();
        String fullURL = builder.getFullURL(veiculo);
        System.out.println(fullURL);
        System.out.println(consumer.consume(fullURL));
    }
}
