package baitaptrenlop.timsoarmstrong;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong {
    public static ArrayList<Integer> tim_so_amstrong_trong_khoang(int start, int end) {
        ArrayList<Integer> amstrongList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            int num = String.valueOf(i).length();
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, num); {
                    temp /= 10;
                }
                if (i == sum) {
                    amstrongList.add(i);
                }

            }
        }
        return amstrongList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số bắt đâu start");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập số kết thúc end");
        int end = Integer.parseInt(scanner.nextLine());
        tim_so_amstrong_trong_khoang(start,end);
    }
}
