package br.com.coutsoft.fipecheck.main;

import br.com.coutsoft.fipecheck.model.CarData;
import br.com.coutsoft.fipecheck.service.APIConsumer;
import br.com.coutsoft.fipecheck.service.DataConverter;
import br.com.coutsoft.fipecheck.service.URLBuilder;
import br.com.coutsoft.fipecheck.view.Menu;


public class Main {
    APIConsumer consumer = new APIConsumer();
    URLBuilder builder = new URLBuilder();

    public String connect(String... args) {
        String fullURL = builder.getFullURL(args);

        return consumer.consume(fullURL);
    }

    public void main() {

        String vehicle = new Menu().vehicleMenu();
        System.out.println(connect(vehicle));

        String brand = new Menu().brandMenu();
        System.out.println(connect(vehicle, brand));

        String model = new Menu().modelMenu();
        System.out.println(connect(vehicle, brand, model));

        String year = new Menu().yearMenu();
        String json = connect(vehicle, brand, model, year);

        CarData carData = new DataConverter().getData(json, CarData.class);
        System.out.println(carData);

    }
}
