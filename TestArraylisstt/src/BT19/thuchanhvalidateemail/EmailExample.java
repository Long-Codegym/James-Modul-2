package BT19.thuchanhvalidateemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    // kiểu check đúng gmail ^[a-zA-Z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$;
    // ^ để đánh dấu bắt đầu


    // phương thức truyền email vào để kiểm tra
    public boolean validate(String inputEmail){
        return true;
    }

}
