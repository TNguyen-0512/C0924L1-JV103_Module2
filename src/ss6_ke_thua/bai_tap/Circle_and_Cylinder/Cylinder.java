package ss6_ke_thua.bai_tap.Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double hieght;

    public Cylinder(double radius, String color, double hieght) {
        super(radius, color);
        this.hieght = hieght;
    }

    public Cylinder() {
        super();
    }

    public double getHieght() {
        return hieght;
    }
    public void setHieght(double hieght) {
        this.hieght = hieght;
    }
    public double Volume() {
        return Math.PI * Math.pow(getRadius(), 2)*hieght;
    }
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", hieght="+ hieght+ ", Volume=" + Volume() + "]";
    }
}
