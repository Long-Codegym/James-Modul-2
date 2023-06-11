package DAY_6.BT_class_Cricle_Cylinder;


import DAY_6.BT_class_Cricle_Cylinder.Modul.Cricle;

public class CircleTest {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        System.out.println(cricle);

        cricle = new Cricle(4.8,"Xanh");
        System.out.println(" thông tin hình tròn 2: ");
        System.out.println(cricle);
        System.out.println(" diện tích hình tròn là2: ");
        System.out.println(cricle.getArea());
    }
}
