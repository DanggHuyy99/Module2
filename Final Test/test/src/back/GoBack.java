package back;

import java.util.Scanner;

public class GoBack {
    public static void input0ToGoBack(){
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        do {
            try {
                System.out.println("\n Nhấn 0 để quay lại");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) break;
                else throw new IllegalArgumentException("Nhập lại");
            } catch (IllegalArgumentException e){
                System.out.println("Nhập lại");
            }

        }while (choice != 0);
    }
}
