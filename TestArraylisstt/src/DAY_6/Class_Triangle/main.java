package DAY_6.Class_Triangle;

import DAY_6.Class_Triangle.Module.Triangle;

public class main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.kTratamgiac();
        System.out.println(triangle);

        triangle= new Triangle(3,4,5);
        triangle.kTratamgiac();
        System.out.println(triangle);
        triangle= new Triangle(1,1,4);
        triangle.kTratamgiac();
        System.out.println(triangle);
    }
}
