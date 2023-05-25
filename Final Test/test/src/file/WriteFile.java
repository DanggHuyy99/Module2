package file;

import model.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteFile {
    static ArrayList<Student> students = new ArrayList<Student>();
    static Scanner scanner  = new Scanner(System.in);
    public void writeFileStudent(ArrayList<Student> students, String studentPath) {
        Student student;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(studentPath));
            student = editStudent();
                    students.add(student);
            for (Student studentProfile : students){
                bufferedWriter.write(studentProfile.getID() + ","
                + studentProfile.getName() + ","
                + studentProfile.getAge() + ","
                + studentProfile.getGender() + ","
                + studentProfile.getAddress() + ","
                + studentProfile.getAverage());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Đã thêm thông tin sinh viên thành công");
    }



    public static Student editStudent(){
        int ID = getID();
        String name = getName();
        int age = getAge();
        String gender = getGender();
        String address = getAddress();
        double avarage = getAverage();
        Student student = new Student(ID, name, age, gender, address, avarage);
        return student;
    }

    public static double getAverage(){
        double average;
        do {
            try {
                System.out.println("Nhập điểm trung bình");
                average = Double.parseDouble(scanner.nextLine());
                if (average >= 0.0 && average <= 10.0) break;
                else {
                    System.out.println("Nhập sai. Nhập lại");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Không đúng định dạng. Nhập lại");
            }
        }while (true);
        return average;
    }

    public static String getAddress(){
        String address;
        do {
            try {
                System.out.println("Nhập địa chỉ");
                address = scanner.nextLine();
                if (address.trim().isEmpty()) throw new IllegalArgumentException("Địa chỉ không được để trống. Nhập lại");
                break;
            } catch (IllegalArgumentException e){
                System.out.println("Địa chỉ không được để trống. Nhập lại");
            }
        }while (true);
        return address;
    }

    public static String getGender(){
        String gender = "";
        do {
            try {
                System.out.println("Nhập giới tính");
                gender = scanner.nextLine();
                if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) throw new IllegalArgumentException("Nhập sai. Nhập lại");
            } catch (IllegalArgumentException e){
                System.out.println("Nhập sai. Nhập lại");
            }
        }while (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"));
        return gender;
    }

    public static int getAge(){
        int ID;
        do {
            try {
                System.out.println("Nhập tuổi");
                ID = Integer.parseInt(scanner.nextLine());
                if (ID > 0) break;
                else {
                    System.out.println("tuổi phải lớn hơn 0");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Không đúng định dạng. Nhập lại");
            }
        } while (true);
        return ID;
    }

    public static int getID(){
        int ID;
        do {
            try {
                System.out.println("Nhập ID sinh viên");
                ID = Integer.parseInt(scanner.nextLine());
                for (Student id : students){
                    if (ID == id.getID()) throw new IllegalArgumentException("Đã có ID này. Nhập lại");
                }
                if (ID > 0) break;
                else {
                    System.out.println("ID phải lớn hơn 0");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Không đúng định dạng. Nhập lại");
            }
        } while (true);
        return ID;
    }

    public static String getName(){
        String name;
        do {
            try {
                System.out.println("Nhập tên sinh viên");
                name = scanner.nextLine();
                if (name.trim().isEmpty()) throw new IllegalArgumentException("Tên không được để trống. Nhập lại");
                break;
            } catch (IllegalArgumentException e){
                System.out.println("Tên không được để trống. Nhập lại");
            }
        }while (true);
        return name;
    }
}
