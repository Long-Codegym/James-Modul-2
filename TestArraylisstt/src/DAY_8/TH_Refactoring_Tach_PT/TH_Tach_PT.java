package DAY_8.TH_Refactoring_Tach_PT;

public class TH_Tach_PT {
    public static String fizzBuzz(int number){
        if(isaBoolean(number))
            return "FizzBuzz";

        if(isaBoolean1(number))
            return "Fizz";

        if(isaBoolean2(number))
            return "Buzz";

        return number + "";
    }

    private static boolean isaBoolean2(int number) {
        return number % 5 == 0;
    }

    private static boolean isaBoolean1(int number) {
        return number % 3 == 0;
    }

    private static boolean isaBoolean(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
