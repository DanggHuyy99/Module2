package resizeable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("Circle radius: " + circle.getRadius());
        circle.resize(50);
        System.out.println("Circle radius after resize: " + circle.getRadius());
        System.out.println("Area Circle: " + circle.getArea());

        Rectangle rectangle = new Rectangle(5.4, 9.3);
        System.out.println("\nRectangle width: " + rectangle.getWidth() + "\nRectangle heigth: " + rectangle.getHeigth());
        rectangle.resize(50);
        System.out.printf("Rectangle width after resize: %.2f" + "\nRectangle heigth after resize: %.2f\n", rectangle.getWidth(), rectangle.getHeigth());
        System.out.println("Area Rectangle: " + rectangle.getArea());

        Square square = new Square(9.9);
        System.out.println("\n\nSquare side: " + square.getSide());
        square.resize(50);
        System.out.printf("Square side after resize: %.3f\n", square.getSide());
        System.out.println("Area Square: " + square.getArea());
        square.howToColor();


    }
}
