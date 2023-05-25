package model;

public class Student {
    private int ID;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double average;

    public Student(int ID, String name, int age, String gender, String address, double average){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.average = average;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
