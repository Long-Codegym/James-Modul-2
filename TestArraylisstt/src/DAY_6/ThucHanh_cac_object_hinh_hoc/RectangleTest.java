package DAY_6.ThucHanh_cac_object_hinh_hoc;

import DAY_6.ThucHanh_cac_object_hinh_hoc.Modul.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.5);
        System.out.println(rectangle);

        rectangle = new Rectangle("đỏ",true, 3.5, 6.0);
        System.out.println(rectangle);
//        System.out.println(rectangle.getPerimeter());
    }
}
