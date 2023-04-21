package demo;

abstract class Shape {
    protected double x, y;
    public void move(double x, double y){
        this.x = x;
        this.y = y;
    }
    abstract void draw();
    abstract void erase();
}
