package DAY_6.ThucHanh_cac_object_hinh_hoc;


import DAY_6.ThucHanh_cac_object_hinh_hoc.Modul.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4.5);
        System.out.println(square);

        square = new Square(3.6,"dô",true);
        System.out.println(square);
    }
}
