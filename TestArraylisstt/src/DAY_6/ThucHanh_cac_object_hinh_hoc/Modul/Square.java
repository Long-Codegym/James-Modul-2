package DAY_6.ThucHanh_cac_object_hinh_hoc.Modul;

import DAY_6.ThucHanh_cac_object_hinh_hoc.Modul.Rectangle;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }


    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }


    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getWidth() +
                '}';
    }

}
