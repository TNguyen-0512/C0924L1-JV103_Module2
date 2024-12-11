package ss6_ke_thua.bai_tap.point_and_movablepoint;

public class Point {
    private float x= 0.0F;
    private float y = 0.0F;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {

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
    public float[] getXY(){
        return new float[2];
    }

    @Override
    public String toString() {
        return "x "+x+" y "+y;
    }
}
