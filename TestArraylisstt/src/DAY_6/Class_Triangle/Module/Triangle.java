package DAY_6.Class_Triangle.Module;

public class Triangle {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void kTratamgiac(){
        if (a + b >c && a+c>b && c+b>a){
            System.out.println(getArra());
        }else {
            System.out.println(" đó khoongphari là một tam giác");
        }
    }
    public double getArra(){
        return (double)1/2*a*b*c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
