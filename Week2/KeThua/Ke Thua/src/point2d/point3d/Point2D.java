package point2d.point3d;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y){
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arrays = new float[2];
        arrays[0] = x;
        arrays[1] = y;
        return arrays;
    }
    @Override
    public String toString(){
        return "Phần tử cha chứa (" + getX() + "," + getY() + ")";
    }
}
