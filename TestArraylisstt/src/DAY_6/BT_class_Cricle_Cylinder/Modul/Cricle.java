package DAY_6.BT_class_Cricle_Cylinder.Modul;

public class Cricle {
    private double r = 1.0;
    private String color = "red";
    public Cricle() {
    }

    public Cricle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return r * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }
}
