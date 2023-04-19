package circle.and.cylinder;

public class Cylinder extends Circle{
    private double height = 2.0;
    public Cylinder(){

    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public double theTich(){
        return height * getArea();
    }
    @Override
    public String toString(){
        return "A Cylinder with height = " + height + " and radius = " + getRadius() +
                ".\nCó thể tích = " + theTich() + ".\n" + super.toString();
    }
}
