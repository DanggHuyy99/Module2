package write.only.classs;

public class Student {
    private String name;
    private String grade;

    Student(){
        name = "Nguyễn Đăng Huy";
        grade = "C0223G2";
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }

    public void test(){
        System.out.println(getName() + getGrade());
    }
    public String display(){
        return "Name: " + this.name + "\n" + " Grade: " + this.grade + ".";
    }
}
