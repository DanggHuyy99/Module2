package illega.triangle.exception;

import java.util.Scanner;

public class Triangle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double side1, side2, side3;

            try {
                System.out.print("Enter side 1: ");
                side1 = Double.parseDouble(input.nextLine());

                System.out.print("Enter side 2: ");
                side2 = Double.parseDouble(input.nextLine());

                System.out.print("Enter side 3: ");
                side3 = Double.parseDouble(input.nextLine());

                if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                    double perimeter = side1 + side2 + side3;
                    double s = (side1 + side2 + side3) / 2;
                    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

                    System.out.println("Perimeter = " + perimeter);
                    System.out.println("Area = " + area);
                } else {
                    System.out.println("Invalid input. The sum of any two sides of a triangle must be greater than the third side.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

