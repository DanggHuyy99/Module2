package sztatic.method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "MARVEL STUDIO";

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "DC COMICS";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

}
