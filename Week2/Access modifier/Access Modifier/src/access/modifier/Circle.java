package access.modifier;

public class Circle {
    private double radius = 1.0;
    private final String COLOR = "Tím Mộng Mơ";
    Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public void display(){
        System.out.printf("Area with radius is " + radius + " and color is " + COLOR + " Area is: %.2f", getArea());
    }
}
