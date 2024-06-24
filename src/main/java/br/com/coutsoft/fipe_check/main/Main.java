package br.com.coutsoft.fipe_check.main;

import br.com.coutsoft.fipe_check.service.APIConsumer;

public class Main {
    public static void main(String[] args) {

        APIConsumer consumer = new APIConsumer();
        System.out.println(consumer.consume());
    }
}
