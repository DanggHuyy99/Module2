package CLASS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter weight");
        double weight = scanner.nextDouble();
        Person person = new Person(name, weight);
        System.out.println(person.display());
    }
}
