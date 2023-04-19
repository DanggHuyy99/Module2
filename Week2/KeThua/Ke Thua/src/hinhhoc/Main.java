package hinhhoc;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setFilled(false);
        System.out.println(shape.toString());

        Circle circle = new Circle(4.5);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(5.1, 3.2, "Tím mộng mơ", false);
        System.out.println(rectangle.toString());

        Square square = new Square(5.1, " Chiều hoàng hôn", true);
        System.out.println(square.toString());
    }
}
