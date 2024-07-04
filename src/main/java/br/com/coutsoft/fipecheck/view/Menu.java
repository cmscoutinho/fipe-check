package br.com.coutsoft.fipecheck.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public String vehicleMenu() {
        int option;
        String optionStr = "";

        do {
            System.out.println("***************************");
            System.out.println("Choose a vehicle:");
            System.out.println("1-Car");
            System.out.println("2-Motorcycle");
            System.out.println("3-Trucks");
            System.out.print("-> ");

            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException | IllegalArgumentException e) {
                option = -1;
            }

            switch (option) {
                case 1 -> optionStr = "carros";
                case 2 -> optionStr = "motos";
                case 3 -> optionStr = "caminhoes";
                default -> System.out.println("Opção inválida!\n");
            }
        } while (option < 0 || option > 3);

        return optionStr;
    }

    public String brandMenu() {
        String brand;
        try {
            System.out.print("Choose a brand: ");
            brand = scanner.nextLine();
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid brand!");
            brand = "";
        }
        return brand;
    }

    public String modelMenu(int option) {
        String model;
        try {
            switch (option) {
                case 1:
                    System.out.print("Type in a model's name: ");
                    break;
                case 2:
                    System.out.print("Choose a model code: ");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            model = scanner.nextLine();
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid model!");
            model = "";
        }
        return model;
    }

    public String yearMenu() {
        String year;
        try {
            System.out.print("Choose a year: ");
            year = scanner.nextLine();
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid year!");
            year = "";
        }
        return year;
    }
}
