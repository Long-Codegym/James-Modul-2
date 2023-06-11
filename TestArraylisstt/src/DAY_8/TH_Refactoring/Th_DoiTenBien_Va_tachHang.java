package DAY_8.TH_Refactoring;

public class Th_DoiTenBien_Va_tachHang {
    public static String fizzBuzz(int number){
        boolean aaa = number % 3 == 0;
        boolean dd = number % 5 == 0;
        if(aaa && dd)
            return "FizzBuzz";

        if(aaa)
            return "Fizz";

        if(dd)
            return "Buzz";

        return number + "";
    }
}