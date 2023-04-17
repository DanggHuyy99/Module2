package CLASS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        System.out.print("Enter a:");
        double a = scanner.nextDouble();
        System.out.print("\nEnter b:");
        double b = scanner.nextDouble();
        System.out.print("\nEnter c:");
        double c = scanner.nextDouble();

        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);
        System.out.println("Phương trình: " + ptb2.getterA() + "x² " + " + " + ptb2.getterB() + "x " + " + " + ptb2.getterC() + " = 0");
        System.out.println("Delta = " + df.format(ptb2.getDiscriminant()));
        System.out.println("Solution:\n " + ptb2.display());
    }

    public QuadraticEquation() {
    }

    DecimalFormat df = new DecimalFormat("#.##");
    private double a;
    private double b;
    private double c;

    public double getterA() {
        return a;
    }

    public double getterB() {
        return b;
    }

    public double getterC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double delta;
    public double getDiscriminant() {
        delta = (b * b) - 4 * (a * c);
        return delta;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
        }
    }



    public String display() {
        if (getDiscriminant() >= 0) {
            return "Root 1: " + df.format(getRoot1()) + " , Root 2: " + df.format(getRoot2());
        } else if (getDiscriminant() == 0){
            return "1 Root: " + df.format(getRoot1());
        } else {
            return "The equation has no roots";
        }
    }

}
