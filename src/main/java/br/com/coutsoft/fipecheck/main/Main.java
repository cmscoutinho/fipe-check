package br.com.coutsoft.fipecheck.main;

import br.com.coutsoft.fipecheck.model.ModelData;
import br.com.coutsoft.fipecheck.model.CarData;
import br.com.coutsoft.fipecheck.model.BrandData;
import br.com.coutsoft.fipecheck.model.YearData;
import br.com.coutsoft.fipecheck.service.APIConsumer;
import br.com.coutsoft.fipecheck.service.DataConverter;
import br.com.coutsoft.fipecheck.service.URLBuilder;
import br.com.coutsoft.fipecheck.view.Menu;

import java.util.Arrays;
import java.util.List;


public class Main {
    APIConsumer consumer = new APIConsumer();

    public String connect(String... args) {
        String fullURL = URLBuilder.getFullURL(args);

        return consumer.consume(fullURL);
    }

    public void main() {

        String vehicle = new Menu().vehicleMenu();
        String brandJson = connect(vehicle);
        List<BrandData> brandData = Arrays.asList(new DataConverter().getData(brandJson, BrandData[].class));
        brandData.forEach(System.out::println);

        String brand = new Menu().brandMenu();
        String modelJson = connect(vehicle, brand);
        ModelData modelData = new DataConverter().getData(modelJson, ModelData.class);
        System.out.println(modelData);

        String model = new Menu().modelMenu();
        String yearJson = connect(vehicle, brand, model);
        List<YearData> yearData = Arrays.asList(new DataConverter().getData(yearJson, YearData[].class));
        yearData.forEach(System.out::println);

        String year = new Menu().yearMenu();
        String finalJson = connect(vehicle, brand, model, year);

        CarData carData = new DataConverter().getData(finalJson, CarData.class);
        System.out.println(carData);

    }
}
