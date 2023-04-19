package point2d.point3d;

public class Point3D extends Point2D{
    protected float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x,y);
        setZ(z);
    }
    public float getZ(){
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ(){
        float[] a = new float[3];
        a[0] = x;
        a[1] = y;
        a[2] = z;
        return a;
    }

    @Override
    public String toString(){
        return "Phần tử con chứa (" + getX() + "," + getY() + "," + getZ() + ")" + "\nlà con của " + super.toString();
    }
}

