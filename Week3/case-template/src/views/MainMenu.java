package views;

import model.Product;
import utils.AppUtils;

import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        while (true) {
            menu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    addProduct();
                    break;
                case "3":
                    break;
                case "8":
                    System.out.println("■ Exiting the application successfully!");
                    System.exit(0);
                default:
                    System.out.println("■ Invalid selected number, please try again!");

            }
        }
    }

    public static String inputName() {
        System.out.println("Input product name: ");
        return scanner.nextLine();
    }

    public static double inputPrice() {
        do {
            try {
                System.out.println("Input product price: ");
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Nhap sai vui long nhap lai");
            }
        } while (true);
    }


    private static void addProduct() {
        String name = inputName();
        double price= AppUtils.retryParseDouble();
        Product newProduct = new Product()
                .setId(System.currentTimeMillis())
                .setName(name)
                .setPrice(price);
        System.out.println("\n■ Product added successfully!");
    }

    public static void menu() {
        System.out.println(
                "\n|        Menu           |" +
                        "\n|1 Product list          \n|" +
                        "\n|2 Product Add           \n|" +
                        "\n|3 Product Edit          \n|" +
                        "\n|8 Exit                  \n|" +

                        "\nType a number above by your choice:                          ");
    }
}
