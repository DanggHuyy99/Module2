package file;

import model.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public void getStudentProfile(ArrayList<Student> students, String studentPath) {
        try {
            students.clear();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(studentPath));

            String lines = bufferedReader.readLine();
            while (lines != null) {
                String[] student = lines.split(",");
                int ID = Integer.parseInt(student[0]);
                String name = student[1];
                int age = Integer.parseInt(student[2]);
                String gender = student[3];
                String address = student[4];
                double average = Double.parseDouble(student[5]);
                Student studentAdd = new Student(ID, name, age, gender, address, average);
                students.add(studentAdd);
                lines = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
