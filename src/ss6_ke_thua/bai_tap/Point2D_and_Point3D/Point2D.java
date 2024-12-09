package ss6_ke_thua.bai_tap.Point2D_and_Point3D;

import java.lang.reflect.Array;

public class Point2D {
    private double x= 0;
    private double y = 0;
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {

    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void getXY(){
        float [] xy = new float[2];
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
