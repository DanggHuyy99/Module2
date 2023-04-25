package triangle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }

    public boolean isIsosceles() {
        return sideA == sideB || sideB == sideC || sideC == sideA;
    }

    public boolean isScalene() {
        return sideA != sideB && sideB != sideC && sideC != sideA;
    }

    public boolean isTriangle(){
        return (sideA + sideB) > sideC && (sideA + sideC) > sideC && (sideB + sideC) > sideA;
    }
}
