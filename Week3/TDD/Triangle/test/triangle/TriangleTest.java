package triangle;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @org.junit.jupiter.api.Test
    void tamGiacDeu() {
        Triangle triangle = new Triangle(9, 9, 9);
        assertTrue(triangle.isEquilateral());
    }

    @Test
    @org.junit.jupiter.api.Test
    void tamGiacCan() {
        Triangle triangle = new Triangle(9, 9, 8);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    @org.junit.jupiter.api.Test
    void tamGiacThuong() {
        Triangle triangle = new Triangle(9, 8, 7);
        assertTrue(triangle.isScalene());
    }

    @Test
    @org.junit.jupiter.api.Test
    void khongPhaiTamGiac(){
        Triangle triangle = new Triangle(9, 15, 389);
        assertFalse(triangle.isTriangle());
    }
}