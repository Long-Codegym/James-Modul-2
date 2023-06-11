package BT19.thuchanhvalidateaccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX ="^[_a-z0-9]{6,}$";

//    public AccountExample() {
//    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        String[] account = new String[]{"123abc_","_abc123","1234_", "abcde"};
        for (String acc:account) {
            boolean check = accountExample.validate(acc);
            System.out.println(" tài khoản" + acc + " kết quả kiểm tra" + check);
        }
    }
}
