package tamgiac;

public class Triangle {
    protected double side1 = 1.0;
    protected double side2 = 1.0;
    protected double side3 = 1.0;

    protected String color = "Đỏ thẵm như đôi môi em";

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getHalfPerimeter() {
        return getPerimeter() / 2;
    }

    public double getArea() {
       return Math.sqrt((getPerimeter() * (getPerimeter() - side1) * (getHalfPerimeter() - side2) * (getHalfPerimeter() - side3)));
    }

}

