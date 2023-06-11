package DAY_6.Class_Poind2D_Poind3D;

import DAY_6.Class_Poind2D_Poind3D.Modul.Point2D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        System.out.println(" tạo độ mới");
        point2D = new Point2D(4.7f , 5.6f);
        System.out.println(point2D);
    }
}
