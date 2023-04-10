package codegym.vn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " is not a prime number");
        } else {
            int is_prime_number = 0;
            for (int i = 1; i <= number; i++){
                if (number % i == 0){
                    is_prime_number++;
                }
            }
            if (is_prime_number == 2){
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}
