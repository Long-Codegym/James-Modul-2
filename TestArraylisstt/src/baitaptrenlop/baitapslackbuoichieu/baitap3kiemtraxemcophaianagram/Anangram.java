package baitaptrenlop.baitapslackbuoichieu.baitap3kiemtraxemcophaianagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập chuỗi 1");
        String str1 = scanner.nextLine();
        System.out.println(" Nhập chuỗi 2");
        String str2 = scanner.nextLine();
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if (Arrays.equals(charArr1,charArr2)){
            System.out.println(" là chuỗi anagram");
        }else {
            System.out.println(" không phải là chuỗi anagram");
        }
    }
}
