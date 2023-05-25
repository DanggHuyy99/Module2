package ex20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckBalancedString checkBalancedString = new CheckBalancedString();
        {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input=sc.next();
                System.out.println(checkBalancedString.isStringBalanced(input));
                //Complete the code
            }

        }
    }
}

