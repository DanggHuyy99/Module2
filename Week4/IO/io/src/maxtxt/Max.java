package maxtxt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Max {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) throw new FileNotFoundException("Hong có đâu em ♥");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception exception){
            System.err.println("Hong có file ♥♥");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    public int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++){
            if (numbers.get(i) > max) max = numbers.get(i);
        }
        return max;
    }

    public void readFile2(String filePath){
        try {
            File file = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
