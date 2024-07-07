package br.com.coutsoft.fipecheck.main;

import br.com.coutsoft.fipecheck.model.Data;
import br.com.coutsoft.fipecheck.model.ModelData;
import br.com.coutsoft.fipecheck.model.CarData;
import br.com.coutsoft.fipecheck.model.YearData;
import br.com.coutsoft.fipecheck.service.APIConsumer;
import br.com.coutsoft.fipecheck.service.DataConverter;
import br.com.coutsoft.fipecheck.service.ModelFilter;
import br.com.coutsoft.fipecheck.service.URLBuilder;
import br.com.coutsoft.fipecheck.view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    private DataConverter converter = new DataConverter();

    public String connect(String... args) {
        String fullURL = URLBuilder.getFullURL(args);

        return APIConsumer.consume(fullURL);
    }

    public void main() {

        Menu menu = new Menu();

        String vehicle = menu.vehicleMenu();
        String brandJson = connect(vehicle);
        List<Data> brandData = converter.getList(brandJson, Data.class);
        brandData.forEach(System.out::println);

        String brand = menu.brandMenu();
        String modelJson = connect(vehicle, brand);
        ModelData modelData = converter.getData(modelJson, ModelData.class);
        System.out.println(modelData);

        String modelQuery = menu.modelMenu(1);
        List<Data> models = ModelFilter.queryFilter(modelQuery, modelData);
        models.forEach(System.out::println);
        String modelCode = menu.modelMenu(2);

        String yearJson = connect(vehicle, brand, modelCode);
        List<Data> yearData = converter.getList(yearJson, Data.class);
        List<CarData> carsData = new ArrayList<>();
        for (Data yearDataIt: yearData) {
            String yearCode = yearDataIt.code();
            String carJson = connect(vehicle, brand, modelCode, yearCode);
            CarData carData = converter.getData(carJson, CarData.class);
            carsData.add(carData);
        }

        carsData.forEach(System.out::println);

    }
}
