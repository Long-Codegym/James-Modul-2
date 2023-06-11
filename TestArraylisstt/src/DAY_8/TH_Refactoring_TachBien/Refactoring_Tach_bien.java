package DAY_8.TH_Refactoring_TachBien;

public class Refactoring_Tach_bien {
    public static int calculate(int a, int b, char o) {
        switch (o) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else System.out.println("sai");
            default:
                System.out.println("hâm");
        }
        return a;

    }
}