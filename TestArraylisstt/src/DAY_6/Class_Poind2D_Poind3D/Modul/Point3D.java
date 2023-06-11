package DAY_6.Class_Poind2D_Poind3D.Modul;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z){
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ(float x, float y, float z){
        float[] getXYZ = new float[3];
        getXYZ[0] = x;
        getXYZ[1] = y;
        getXYZ[3] = z;
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x= " +getX() +
                " y= " + getY() +
                " z=" + z + "}";
    }
}
