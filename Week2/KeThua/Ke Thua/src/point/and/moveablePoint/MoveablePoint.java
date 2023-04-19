package point.and.moveablePoint;

public class MoveablePoint extends Point {
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] a = new float[2];
        a[0] = getxSpeed();
        a[1] = getySpeed();
        return a;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = (" + this.getxSpeed() + "," + this.getySpeed() + ")";
    }

    public float[] move() {
        float[] a = new float[2];
        x += getxSpeed();
        y += getySpeed();
        return a;
    }
}
