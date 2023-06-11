package BT19.baitapvalidatesodienthoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhone {
    public static final String PHONE_CHECK = "^[(][8][4][)][-][0-9]{10}$";

    public boolean checkSDT(String phone) {

        Pattern pattern = Pattern.compile(PHONE_CHECK);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static void main(String[] args) {
        CheckPhone checkPhone = new CheckPhone();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(" Nhập tên lớp cần em định dạng: ");
            String namecheck = scanner.nextLine();
            boolean kT = checkPhone.checkSDT(namecheck);
            System.out.println(" Tên lớp " + namecheck + " kiểm tra đúng tên ko: " + kT );
        }
    }
}
