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

    public String modelMenu() {
        System.out.print("Choose a model: ");
        return scanner.nextLine();
    }
}
