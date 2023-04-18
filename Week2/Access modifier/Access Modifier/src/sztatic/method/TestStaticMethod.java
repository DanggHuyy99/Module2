package sztatic.method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student_1 = new Student(123, "Spider Man");
        Student student_2 = new Student(456, "Iron Man");
        Student student_3 = new Student(789, "Bat Man");

        student_1.display();
        student_2.display();
        student_3.display();
    }
}
