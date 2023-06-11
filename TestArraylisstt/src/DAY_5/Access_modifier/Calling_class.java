package DAY_5.Access_modifier;

public class Calling_class {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.getRadius();
        circle1.getColor();
        System.out.println(circle1);
    }
}
