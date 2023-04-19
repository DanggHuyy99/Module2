package circle.and.cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "Đỏ rực lửa";

    public Circle() {

    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, String color) {
        setRadius(radius);
        setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Invalid radius");
            System.exit(0);
            return;
        }
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius is " + getRadius() + " and color is " + getColor()
                + ".\nHas area is " + getArea();
    }
}
