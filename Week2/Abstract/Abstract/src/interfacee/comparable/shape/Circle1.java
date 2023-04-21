package interfacee.comparable.shape;

public class Circle1 {
    protected double radius = 1;
    public Circle1(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return "Hình tròn có bán kính: " + getRadius();
    }
}
