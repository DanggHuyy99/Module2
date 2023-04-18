package access.modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle_1 = new Circle();
        circle_1.display();
        System.out.println("\n" + circle_1.getArea());
        System.out.print(circle_1.getRadius());
    }
}
