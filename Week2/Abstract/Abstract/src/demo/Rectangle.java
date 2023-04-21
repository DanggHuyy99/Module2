package demo;

abstract class Rectangle extends Shape{
    abstract void draw();

    @Override
    public void move(double x, double y) {
        super.move(x, y);
    }

    @Override
    void erase() {
        System.out.println("Xoá");
    }

}
