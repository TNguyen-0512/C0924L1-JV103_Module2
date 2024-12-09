package ss6_ke_thua.bai_tap.point2d_and_point3d;

public class Point3D extends Point2D {
    private float z = 0.0F;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public void getXYz() {
        float [] xyz = new float[3];
    }

    @Override
    public String toString() {
        return "Point3D "+ super.toString() + " z "+ z ;
    }
}
