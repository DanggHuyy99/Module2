package point2d.point3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(-1.2f, 5.9f);
        float[] arrays = point2D.getXY();
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(9.5f, 19.7f, 78.6f);
        Point3D point3D1 = new Point3D();

        point3D1.setXYZ(198.4f, 987.9f, 7979.5f);
        float[] arrays_2 = point3D1.getXYZ();
        for (float a : arrays_2) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(point3D.toString());
    }
}
