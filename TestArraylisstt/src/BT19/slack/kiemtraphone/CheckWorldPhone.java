package BT19.slack.kiemtraphone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckWorldPhone {
    private static final String CHECK_PHONE ="^[+][0-9]{1,2}[-]([0-9]{3}[-])?[0-9]{3}([-])?[0-9]{4}$";
    public boolean CheckPhone(String phoneCheck){
        Pattern pattern = Pattern.compile(CHECK_PHONE);
        Matcher matcher = pattern.matcher(phoneCheck);
        return matcher.matches();
    }

    public static void main(String[] args) {
        CheckWorldPhone checkWorldPhone = new CheckWorldPhone();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" nhập số điện thoai cần check");
            String phone = scanner.nextLine();
            boolean check = checkWorldPhone.CheckPhone(phone);
            System.out.println(" SĐt: " + phone + " kết quả kiểm tra: " + check);
        }
    }
}
