package ss6_ke_thua.bai_tap.point2d_and_point3d;

public class Point2D {
    private float x= 0.0F;
    private float y = 0.0F;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {

    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
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
        return "x "+x+" y "+y;
    }
}