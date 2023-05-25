package maxtxt;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn: ");
        String filePath = scanner.nextLine();

        Max max = new Max();
        List<Integer> numbers = max.readFile(filePath);
        int maxValue = max.findMax(numbers);
        max.writeFile(filePath, maxValue);
        max.readFile2(filePath);
    }
}
