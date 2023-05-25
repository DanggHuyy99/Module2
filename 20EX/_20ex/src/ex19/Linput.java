package ex19;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Linput {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void inputToL() {
        System.out.println("Nhập số lượng phần tử");
        int size = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(50) + 1);
        }
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println("\nNhập số lượng truy vấn:");
        int choice = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < choice; i++) {
            System.out.println("Muốn Insert hay delete");
            String wantToDo = scanner.nextLine();
            if (wantToDo.equalsIgnoreCase("Insert")) {
                int index;
                while (true){
                    try {
                        System.out.println("Nhập index");
                        index = Integer.parseInt(scanner.nextLine());
                        if (index >= arrayList.size()) throw new IndexOutOfBoundsException("Ngoài index. Nhập lại");
                        else if (index < 0) System.out.println("Index phải >= 0");
                        else break;
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("Ngoài index. Nhập lại");
                    }
                }
                System.out.println("Nhập giá trị muốn thêm");
                int value = Integer.parseInt(scanner.nextLine());
                arrayList.add(index, value);
            } else if (wantToDo.equalsIgnoreCase("delete")) {
                System.out.println("Nhập index muốn xoá");
                int index = Integer.parseInt(scanner.nextLine());
                arrayList.remove(index);
            } else System.out.println("Nothing to change");
        }

        for (int num : arrayList) {
            System.out.print(num + " ");
        }
    }
}
