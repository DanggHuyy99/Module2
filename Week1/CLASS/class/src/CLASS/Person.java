package CLASS;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter weight");
        double weight = scanner.nextDouble();
        Person person = new Person(name, weight);
        System.out.println(person.display());


    }

    public Person() {
    }

    public String name;
    public double weight;


    public Person(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public String display(){
        return "Name: " + this.name + " , Weight: " + this.weight + " kg";
    }
}
