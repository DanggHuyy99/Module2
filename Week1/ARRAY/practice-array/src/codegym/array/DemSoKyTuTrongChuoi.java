package codegym.array;

import java.util.Scanner;

public class DemSoKyTuTrongChuoi {
    public static void main(String[] args) {
        String name = "Nguyen Dang Huy";
        char[] name_split = name.toCharArray();
        String name_input = "Dang";
        char[] name_input_split = name_input.toCharArray();

        int count = 0;
        for (int i = 0; i < name_input_split.length; i++) {
            for (int j = 0; j < name_split.length; j++){
                if (name_input_split[i] == name_split[j]){
                    count++;
                }
            }
            System.out.println("Ký tự " + name_input_split[i] + " xuất hiện " + count + " lần");
            count = 0;
        }


    }
}
