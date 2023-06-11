package DAY_6.BT_class_Cricle_Cylinder.Modul;

public class Cylinder extends Cricle {
    private double height = 3.0;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double r, String color, double height) {
        super(r, color);
        this.height = height;
    }

    public double getTheTich() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
