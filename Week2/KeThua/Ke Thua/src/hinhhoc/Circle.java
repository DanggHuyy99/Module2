package hinhhoc;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    private void setRadius(double radius){
        if (radius < 0){
            System.out.println("Invalid radius");
            return;
        }
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius = " + getRadius() + " , which is subclass of " + super.toString();
    }
}
