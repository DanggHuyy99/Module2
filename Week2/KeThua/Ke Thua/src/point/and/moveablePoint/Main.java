package point.and.moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.4f, 98.4f);
        Point point1 = new Point();
        point1.setXY(9999.8888f, 555.222f);
        float[] arrays = point1.getXY();
        for (float a:arrays) {
            System.out.print(a + " ");
        }
        System.out.println("\n" + point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(1.1f, 2.2f, 3.3f, 4.4f);
        System.out.println(moveablePoint.toString());

        moveablePoint.move();
        System.out.println(moveablePoint);

//        Point[] points = new Point[5];

    }
}
