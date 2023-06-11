package BT19.baitapvailedatetenlophoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValieClass {
        private static final String CLASS= "^[CAP][0-9]{4}[GHIK]$";

        public boolean checkClass(String nameClass){
            Pattern pattern = Pattern.compile(CLASS);
            Matcher matcher = pattern.matcher(nameClass);
            return matcher.matches();
        }

    public static void main(String[] args) {
        ValieClass nameClass = new ValieClass();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(" Nhập tên cần check:");
            String name = scanner.nextLine();
            boolean check = nameClass.checkClass(name);
            System.out.println(" Tên class " + name + " kiểm tra ra kêt quả: " + check);
        }
    }

}
