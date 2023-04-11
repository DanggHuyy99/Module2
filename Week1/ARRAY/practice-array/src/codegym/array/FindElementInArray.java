package codegym.array;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] names = {"Yoona", "Lisa", "Rosie", "Jenie", "Baeby"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(input_name)) {
                System.out.println("Position of the name " + input_name + " in the list is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + input_name + " in the list.");
    }
}
