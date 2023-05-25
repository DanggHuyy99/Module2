package view;

import back.GoBack;
import file.ReadFile;
import file.WriteFile;
import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    String studentPath = "data/student.csv";
    static ArrayList<Student> students = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);
    public void studentView(){
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    showList();
                    break;
                case 2:
                    creatNew();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    readCSV();
                    break;
                case 7:
                    writeCSV();
                    break;
                case 8:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
            }
        }while (true);


    }

    private static void showMenu() {
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN---");
        System.out.println("Chọn chức năng theo số(để tiếp tục)");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xoá");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng");
    }

    private void writeCSV() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(studentPath));
            for (Student profile : students){
                bufferedWriter.write(profile.getID() + ","
                        + profile.getName() + ","
                        + profile.getAge() + ","
                        +profile.getGender() + ","
                        +profile.getAddress() + ","
                        +profile.getAverage());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Đã cập nhật file");
    }

    private void readCSV() {
        ReadFile readFile = new ReadFile();
        readFile.getStudentProfile(students, studentPath);
//                    readFile.getStudentProfile(students, studentPath);
        System.out.println("Đã cập nhật toàn bộ nhớ danh sách sinh viên từ file student.csv");
    }

    private void sort() {
        int choice;
        while (true){
            try {
                System.out.println("1. Sắp xếp điểm trung bình tăng dần");
                System.out.println("2. Sắp xếp điểm trung bình giảm dần");
                System.out.println("Chọn chức năng");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 & choice < 3) break;
                else System.out.println("Nhập sai. Nhập lại");
            } catch (IllegalArgumentException e){
                System.out.println("Nhập sai. Nhập lại");
            }
        }

        switch (choice){
            case 1:
                List<Double> averageScoresIn = new ArrayList<>();
                for(Student profile : students){
                    averageScoresIn.add(profile.getAverage());
                }
                Collections.sort(averageScoresIn);
                System.out.println("Điểm trung bình sắp xếp tăng dần");
                for (double score : averageScoresIn){
                    System.out.print(score + "  ");
                    for (Student name : students){
                        if (score == name.getAverage()){
                            System.out.println(" : " + name.getName());
                        }
                    }
                }
                GoBack.input0ToGoBack();
                break;
            case 2:
                List<Double> averageScoresOut = new ArrayList<>();
                for(Student profile : students){
                    averageScoresOut.add(profile.getAverage());
                }
                Collections.sort(averageScoresOut, Collections.reverseOrder());
                System.out.println("Điểm trung bình sắp xếp giảm dần");
                for (double score : averageScoresOut){
                    System.out.print(score);
                    for (Student name : students){
                        if (score == name.getAverage()){
                            System.out.println(" : " + name.getName());
                        }
                    }
                }
                GoBack.input0ToGoBack();
                break;
        }
    }

    private void delete() {
        int IDWantToDel;
        while (true){
            try {
                System.out.println("Nhập mã sinh viên muốn xoá:");
                IDWantToDel = Integer.parseInt(scanner.nextLine());
                if (IDWantToDel > 0){
                    boolean checkID = false;
                    for (Student id : students){
                        if (IDWantToDel == id.getID()){
                            checkID = true;
                            break;
                        }
                    }
                    if (!checkID){
                        System.out.println("Không tìm được sinh viên với mã sinh viên trên");
                    }
                    if (checkID){
                        for (Student profile : students){
                            if (IDWantToDel == profile.getID()){
                                String del ="";
                                System.out.println("Bạn có muốn xoá không (Yes/No)");
                                del=scanner.nextLine();
                                if (del.equalsIgnoreCase("yes")){
                                    students.remove(profile);
//                                            try {
//                                                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(studentPath));
//                                                for (Student PFAfterDel : students){
//                                                    bufferedWriter.write(PFAfterDel.getID() + ","
//                                                            + PFAfterDel.getName() + ","
//                                                            + PFAfterDel.getAge() + ","
//                                                            +PFAfterDel.getGender() + ","
//                                                            +PFAfterDel.getAddress() + ","
//                                                            +PFAfterDel.getAverage());
//                                                    bufferedWriter.newLine();
//                                                }
//                                                bufferedWriter.close();
//                                            } catch (IOException e) {
//                                                throw new RuntimeException(e);
//                                            }
                                    System.out.println("Đã xoá thông tin thành công");
                                    break;
                                } else if (del.equalsIgnoreCase("no")){
                                    break;
                                }
                            }
                        }
                    }
                    if(checkID) {
                        break;
                    }

//                                break;
                }
            } catch (IllegalArgumentException e){
                System.out.println("Sai định dạng. Nhập lại");
            }
        }
    }

    private void update() {
        int IDWantToEdit = -1;
        while (true){
            try {
                System.out.println("Nhập mã sinh viên cần sửa:");
                IDWantToEdit = Integer.parseInt(scanner.nextLine());

//                            if (IDWantToEdit == Integer.parseInt("")) break;
                if (IDWantToEdit > 0) {
                    boolean checkID = false;
                    for (Student id : students){
                        if (IDWantToEdit == id.getID()){
                            checkID = true;
                            break;
                        }
                    }
                    if (!checkID){
                        System.out.println("Không tìm được sinh viên với mã sinh viên trên");
                    }
                    if (checkID){
                        for (Student id : students){
                            if (IDWantToEdit == id.getID()){
                                int ID = WriteFile.getID();
                                id.setID(ID);
                                String name = WriteFile.getName();
                                id.setName(name);
                                int age = WriteFile.getAge();
                                id.setAge(age);
                                String gender = WriteFile.getGender();
                                id.setGender(gender);
                                String address = WriteFile.getAddress();
                                id.setAddress(address);
                                double average = WriteFile.getAverage();
                                id.setAverage(average);
                                System.out.println("Đã sửa thông tin thành công");
                                WriteFile writeFile1 = new WriteFile();
//                                            try {
//                                                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(studentPath));
//                                                for (Student profile : students){
//                                                    bufferedWriter.write(profile.getID() + ","
//                                                            + profile.getName() + ","
//                                                            + profile.getAge() + ","
//                                                            +profile.getGender() + ","
//                                                            +profile.getAddress() + ","
//                                                            +profile.getAverage());
//                                                    bufferedWriter.newLine();
//                                                }
//                                                bufferedWriter.close();
//                                            } catch (IOException e) {
//                                                throw new RuntimeException(e);
//                                            }
//                                            System.out.println("Đã sửa thông tin thành công");
                                break;
                            }
                        }
                    }


                    if(checkID) {
                        break;
                    }
                }
                else System.out.println("ID phải lớn hơn 0");
            } catch (IllegalArgumentException e){
                if(String.valueOf(IDWantToEdit).equals("")) {
                    break;
                }
                System.out.println("Sai định dạng. Nhập lại");
            }
        }
    }

    private void creatNew() {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFileStudent(students, studentPath);
        GoBack.input0ToGoBack();
    }

    private void showList() {
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s", "ID", "Name", "Age", "Gender", "Address", "Average");
        int count = 5;
//                    while (true) {
        int i = 0;
        for (Student profile : students){
            i+=1;
            System.out.println();
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s", profile.getID(), profile.getName(), profile.getAge(), profile.getGender(), profile.getAddress(), profile.getAverage());
            if(i % count == 0) {
                System.out.println("\nNhấn Enter");
                String input = scanner.nextLine();
            }
        }
//                        if(input.equals("")) {
//                            if(count > students.size()) {
//                                break;
//                            }
//                            count += 5;
//                        } else {
//                            break;
//                        }
//                    }
        GoBack.input0ToGoBack();
    }
}
