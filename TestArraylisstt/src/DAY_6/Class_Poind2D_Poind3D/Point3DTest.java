package DAY_6.Class_Poind2D_Poind3D;

import DAY_6.Class_Poind2D_Poind3D.Modul.Point3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        System.out.println(" tạo độ mới mới");
        point3D = new Point3D(3.0f, 4.8f, 5.6f);
        System.out.println(point3D);
    }
}
