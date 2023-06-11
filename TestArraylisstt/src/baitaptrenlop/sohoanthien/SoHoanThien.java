package baitaptrenlop.sohoanthien;

import java.util.Scanner;

public class SoHoanThien {
    public static int tim_so_hoan_thien_tiep_theo(int n) {
        int next = n;
        while (true) {
            int sum = 0;
            for (int i = 1; i < next; i++) {
                if (next % i == 0){
                    sum +=i;
                }
            }
            if (sum == next){
                System.out.println( " số hoàn thiện tiếp theo là" + next);}
            break;
        }
        next++;
        return next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        tim_so_hoan_thien_tiep_theo(n);
    }
}
