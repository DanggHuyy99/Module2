package test;

import java.io.*;

public class MyFile2 {
    public static void main(String[] args) throws IOException {
        String str = "He Sờ Lô" + " He Sờ Ly Ly ♥ Anh Tú";

            FileWriter fileWriter = new FileWriter("C:\\NguyenDangHuyy99\\Module2\\Week4\\IO\\File\\huy1.txt");
            for (int i = 0; i < str.length(); i++){
                fileWriter.write(str.charAt(i));
            }
            fileWriter.write("\n");
            fileWriter.write("Hi Hi Hi ♥♥♥");
            fileWriter.close();

            try {
                FileReader fileWriter2 = new FileReader("C:\\NguyenDangHuyy99\\Module2\\Week4\\IO\\File\\huy1.txt");
                BufferedReader bufferedReader = new BufferedReader(fileWriter2);

                String line;
                while ((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
                bufferedReader.close();

            } catch (FileNotFoundException fileNotFoundException){
                System.out.println("Không có file mà đọc đâu em ♥");
            }
    }
}
