package br.com.coutsoft.fipecheck.main;

import br.com.coutsoft.fipecheck.service.APIConsumer;
import br.com.coutsoft.fipecheck.service.URLBuilder;
import br.com.coutsoft.fipecheck.view.Menu;


public class Main {
    APIConsumer consumer = new APIConsumer();
    URLBuilder builder = new URLBuilder();

    public void connect(String... args) {
        String fullURL = builder.getFullURL(args);

        System.out.println(consumer.consume(fullURL));
    }

    public void main() {

        String vehicle = new Menu().vehicleMenu();
        connect(vehicle);

        String brand = new Menu().brandMenu();
        connect(vehicle, brand);

        String model = new Menu().modelMenu();
        connect(vehicle, brand, model);

        String year = new Menu().yearMenu();
        connect(vehicle, brand, model, year);

    }
}
