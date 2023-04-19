package kethua;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    public String toString(){
        return super.toString() + "\nradius is " + isFilled();
    }
}
