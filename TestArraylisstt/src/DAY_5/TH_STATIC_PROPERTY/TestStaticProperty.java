package DAY_5.TH_STATIC_PROPERTY;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Vinfast VF9", "V12");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("BMW I8", "V8");
        System.out.println(Car.numberOfCars);
    }
}
