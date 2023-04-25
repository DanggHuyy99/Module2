package view;

import java.util.Scanner;

public class Switch {
    public static void showSwitch(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Nhập 1 số");
            choice = Integer.parseInt(scanner.nextLine());
            checkNumber10to19(choice);
        }while (choice < 100);
    }
    public static void checkNumber10to19(int number){
        switch (number){
            case 3:
                System.out.println("Fizz");
                break;
            case 5:
                System.out.println("Buzz");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("Fourteen");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 16:
                System.out.println("Sixteen");
                break;
            case 17:
                System.out.println("Seventeen");
                break;
            case 18:
                System.out.println("Eighteen");
                break;
            case 19:
                System.out.println("Nineteen");
                break;
        }
    }
}
