package write.only.classs;

public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student();
        student_1.setName("Bell");
        student_1.setGrade("HUAF");
        System.out.println("Show:");
        student_1.test();
        System.out.println("\n" + student_1.display());
    }
}
