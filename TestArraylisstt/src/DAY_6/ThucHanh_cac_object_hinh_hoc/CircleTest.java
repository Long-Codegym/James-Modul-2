package DAY_6.ThucHanh_cac_object_hinh_hoc;

import DAY_6.ThucHanh_cac_object_hinh_hoc.Modul.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("yelow", false, 3.5);
    }
}
