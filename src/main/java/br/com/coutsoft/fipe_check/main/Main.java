package br.com.coutsoft.fipe_check.main;

import br.com.coutsoft.fipe_check.service.APIConsumer;
import br.com.coutsoft.fipe_check.service.URLBuilder;
import br.com.coutsoft.fipe_check.view.Menu;

public class Main {
    public static void main(String[] args) {

        String veiculo = new Menu().menu();

        APIConsumer consumer = new APIConsumer();
        URLBuilder builder = new URLBuilder();
        String fullURL = builder.getFullURL(veiculo);
        System.out.println(consumer.consume(fullURL));
    }
}
