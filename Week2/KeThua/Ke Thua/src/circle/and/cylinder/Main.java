package circle.and.cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.1);
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(9.11, 4.5);
        System.out.println(cylinder.toString());
    }
}
