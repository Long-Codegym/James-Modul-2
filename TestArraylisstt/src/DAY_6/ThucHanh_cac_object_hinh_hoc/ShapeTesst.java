package DAY_6.ThucHanh_cac_object_hinh_hoc;

import DAY_6.ThucHanh_cac_object_hinh_hoc.Modul.Shape;

public class ShapeTesst {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println();

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
