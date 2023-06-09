package resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double heigth;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getPerimeter() {
        return (width + heigth) * 2;
    }

    public double getArea() {
        return width * heigth;
    }

    @Override
    public void resize(double percent) {
        width *= (1 + percent / 100);
        heigth *= (1 + percent / 100);
    }
}
