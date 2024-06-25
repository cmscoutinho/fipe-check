package br.com.coutsoft.fipecheck.main;

import br.com.coutsoft.fipecheck.service.APIConsumer;
import br.com.coutsoft.fipecheck.service.URLBuilder;
import br.com.coutsoft.fipecheck.view.Menu;

public class Main {
    APIConsumer consumer = new APIConsumer();
    URLBuilder builder = new URLBuilder();

    public void connect(String ... args) {
        String fullURL = builder.getFullURL(args);
        System.out.println(fullURL);
        System.out.println(consumer.consume(fullURL));
    }
    public void main() {

        String vehicle = new Menu().vehicleMenu();
        connect(vehicle);
        String model = new Menu().modelMenu();
        connect(vehicle, model);

    }
}
