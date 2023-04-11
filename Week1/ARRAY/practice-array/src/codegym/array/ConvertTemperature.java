package codegym.array;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = scanner.nextDouble();
                    System.out.printf("Fahrenheit to Celsius: %.2f\n", fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celcius:");
                    celsius = scanner.nextDouble();
                    System.out.printf("Celcius to Fahrenheit: %.2f\n ", celciusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double fahrenheitToCelcius(double a) {
        double celcius = (5.0 / 9) * (a - 32);
        return celcius;
    }

    public static double celciusToFahrenheit(double a) {
        double fahrenheit = (5.0 / 9) * (a - 32);
        return fahrenheit;
    }
}
