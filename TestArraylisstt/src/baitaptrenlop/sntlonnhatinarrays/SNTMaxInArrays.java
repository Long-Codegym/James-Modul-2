package baitaptrenlop.sntlonnhatinarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SNTMaxInArrays {
    static Scanner scanner = new Scanner(System.in);
    public static int[] sNT(int size){
        int[] sNT = new int[size];
        for (int i =0; i < sNT.length; i++){
            System.out.println(" nhập số với vị trí tại " + i);
            sNT[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(" dãy số đã nhập");
        System.out.println(Arrays.toString(sNT));
        Arrays.sort(sNT);
        System.out.println(" dãy số sau khi đã sắp xếp");
        System.out.println(Arrays.toString(sNT));
        for (int i = sNT.length-1; i >=0 ; i--) {
            boolean check = true;
            for (int j = 2; j < Math.sqrt(sNT[i]); j++) {
                if (sNT[i] % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(" SNT lớn nhất trong dãy là " + sNT[i]);
                break;
            }
        }
        return sNT;
    }

    public static void main(String[] args) {
        System.out.println(" Nhập kích thước mảnh:");
        int size = Integer.parseInt(scanner.nextLine());
        sNT(size);
    }
}
