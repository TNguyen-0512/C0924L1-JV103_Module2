package ss6_ke_thua.bai_tap.Circle_and_Cylinder;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"Red");
        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 6);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
