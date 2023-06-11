package BT13.optionalthuchanhtinhdophuctapthuattoan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập chuỗi");
        String str = scanner.nextLine();
        int[] intchaar = new int[255];
        for (int i =0; i < str.length(); i++){
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) str.charAt(i);
            /* Tăng giá trị tần suất */
            intchaar[ascii] +=1;
        }
        int max = 0;
        char charater = (char) 255;
        for (int i =0; i< 255; i++){
            if (intchaar[i]>max){
                max = intchaar[i];
                charater = (char) i;
            }
        }
    }
}
