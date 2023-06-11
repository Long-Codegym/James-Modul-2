package BT19.slack.checkpassword;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPasword {
        private static final String REGEX_PASSWORD ="^(?=.*[a-z])(?=.*[A-Z]).+$" ;
        public boolean CheckPassword(String checkPass){
            Pattern pattern = Pattern.compile(REGEX_PASSWORD);
            Matcher matcher = pattern.matcher(checkPass);
            return matcher.matches();
        }

    public static void main(String[] args) {
        CheckPasword checkPasword = new CheckPasword();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(" nhap password");
            String password = scanner.nextLine();
            boolean check = checkPasword.CheckPassword(password);
            System.out.println(" password: " + password + " ket qua check: " + check);
        }
    }
}
