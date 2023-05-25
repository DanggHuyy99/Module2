package sumtxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn:");
        String filePath = scanner.nextLine();

        readFile(filePath);
    }

    private static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("Không có file để mà đọc");
                throw new FileNotFoundException("♥♥");
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("Tổng: " + sum);
        } catch (Exception foundException) {
            System.err.println("Yêu Em ♥");
        }
    }
}
