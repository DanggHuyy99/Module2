package demo;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }

    @Override
    public void erase() {
        System.out.println("Xoá");
    }
}
