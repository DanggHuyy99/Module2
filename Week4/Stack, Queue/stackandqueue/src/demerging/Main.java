package demerging;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<String> NU = new LinkedList<>();
        Queue<String> NAM = new LinkedList<>();
        Queue<String> LGBT = new LinkedList<>();

        System.out.println("Nhập số lượng muốn thêm vào");
        int size = Integer.parseInt(scanner.nextLine());

        int i = 0;
        String name;
        int date;
        String gender;
        while (i < size){
            System.out.println("Nhập tên:");
            name = scanner.nextLine();

            System.out.println("Nhập năm sinh:");
            date = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập giới tính:");
            gender = scanner.nextLine();

            if (gender.toLowerCase().equals("nu")) NU.add(name + " " + date);
            else if (gender.toLowerCase().equals("nam")) NAM.add(name + " " + date);
            else LGBT.add(name + " " + date);
            i++;
        }
        System.out.println("Danh sách:");
        while (!NU.isEmpty()){
            System.out.println(NU.remove() + " giới tính nữ");
        }
        while (!NAM.isEmpty()){
            System.out.println(NAM.remove() + " giới tính nam");
        }
        while (!LGBT.isEmpty()){
            System.out.println(LGBT.remove() + " giới tính thứ ba");
        }
    }
}
