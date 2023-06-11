package DAY_5.TH_STATIC_METHOD;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // gọi phương thức change ( calling change method)

        Student s1 = new Student(24, "Long");
        Student s2 = new Student(44, "Vladimir");

        // callig display method gọi đến phương thức display
        s1.display();
        s1.display();
    }
}
