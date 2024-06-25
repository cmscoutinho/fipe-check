package br.com.coutsoft.fipe_check.view;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public String menu() {
        int option;
        String optionStr = "";

        do {
            System.out.println("***************************");
            System.out.println("Choose a vehicle:");
            System.out.println("1-Car");
            System.out.println("2-Motorcycle");
            System.out.println("3-Trucks");
            System.out.print("-> ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    optionStr = "carros";
                    break;
                case 2:
                    optionStr = "motos";
                    break;
                case 3:
                    optionStr = "caminhoes";
                    break;
                default:
                    System.out.println("Opção inválida!\n");;
            }
        } while (option < 0 || option > 3);

        return optionStr;
    }
}
