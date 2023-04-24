package Menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Log in");
            System.out.println("4. Log Out");
            System.out.println("0. Exit");
            System.out.println("\nYour choose ? ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    admin();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static void admin() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Username or Email ?");
            System.out.println("2. Password");
            System.out.println("3. Back");
            System.out.println("\nYour chosse ?");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (choose != 3);


    }
}
