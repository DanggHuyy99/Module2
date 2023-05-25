package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) {
        testFile();
        bufferedWriter();
    }

    private static void bufferedWriter() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\NguyenDangHuyy99\\Module2\\Week4\\IO\\File\\huy1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(65);
            bufferedWriter.flush();
        } catch (IOException o) {
            System.out.println("Lỗi");
        }
    }

    private static void testFile() {
        File file = new File("C:\\NguyenDangHuyy99\\Module2\\Week4\\IO\\File\\huy.txt");
        if (file.exists()) System.out.println("HIHIHI");
        char[] items = {'h', 'h', 'y', 'u'};
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Em yêu anh");
            fileWriter.write(items, 1, 2);
            fileWriter.write(65);
            fileWriter.write(items.toString());


            fileWriter.close();
        } catch (IOException ioException) {
            System.out.println("Lỗi");
        }
    }
}
