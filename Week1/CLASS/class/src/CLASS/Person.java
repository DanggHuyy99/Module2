package CLASS;

import java.util.Scanner;

public class Person {


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
