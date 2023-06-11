package DAY_6.BT_class_Cricle_Cylinder;

import DAY_6.BT_class_Cricle_Cylinder.Modul.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.getTheTich());
        cylinder = new Cylinder(4.8);
        System.out.println(cylinder.getTheTich());
    }
}
