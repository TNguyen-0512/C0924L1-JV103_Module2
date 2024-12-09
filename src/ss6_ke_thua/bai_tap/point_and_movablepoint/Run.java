package ss6_ke_thua.bai_tap.point_and_movablepoint;

public class Run {
    public static void main(String[] args) {
        Point point = new Point(5.6F,7.5F);
        MovablePoint movablePoint = new MovablePoint(point.getX(), point.getY(),5.5F,7.5F);
        System.out.println(point);
        System.out.println(movablePoint);
    }
}
