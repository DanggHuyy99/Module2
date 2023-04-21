package interfacee.comparable.shape;

import demo.Circle;

public class ComparableCircle extends Circle1 implements Comparable{
    public ComparableCircle() {
        super(1);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }


    @Override
    public String toString(){
        return "Hình tròn có bán kính: " + radius;
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
