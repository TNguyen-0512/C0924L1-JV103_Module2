package ss6_ke_thua.bai_tap.point2d_and_point3d;


public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(6,5);
        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 6);
        System.out.println(point2D);
        System.out.println(point3D);
    }
}
