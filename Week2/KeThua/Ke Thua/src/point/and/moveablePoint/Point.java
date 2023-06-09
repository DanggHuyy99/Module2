package point.and.moveablePoint;

public class Point {
    protected float x = 0.0f;
    protected float y =0.0f;

    public Point(){
    }

    public Point(float x, float y){
        setX(x);
        setY(y);
    }

    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] a = new float[2];
        a[0] = getX();
        a[1] = getY();
        return a;
    }
    @Override
    public String toString(){
        return "Mảng ông nội (" + getX() + "," + getY() + ")";
    }
}
