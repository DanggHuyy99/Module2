package CLASS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Enter width(m):");
        double width = scanner.nextDouble();
        System.out.println("Enter lenght(m)");
        double length = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, length);
        System.out.println(rectangle.display());
        System.out.println("Perimeter is : " + df.format(rectangle.getPerimeter()) + " m");
        System.out.println("Area is: " + df.format(rectangle.getArea()) + " m²");
    }
    double width, heigth;

    public Rectangle() {
    }

    DecimalFormat df = new DecimalFormat("#.##");

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getArea() {
        return this.heigth * this.width;
    }

    public double getPerimeter() {
        return (this.width + this.heigth) * 2;
    }

    public String display(){
        return ("The Rectangle has width : " + df.format(width) + " , length : " + df.format(heigth));
    }
}
