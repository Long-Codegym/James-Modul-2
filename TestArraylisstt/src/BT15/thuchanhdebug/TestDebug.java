package BT15.thuchanhdebug;

import java.util.Scanner;

public class TestDebug {
    public static void main(String[] args) {
        System.out.println(" VladimirLong");
        System.out.println(" Given a equations as 'a *x + b =0', pleas");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhập a:");
        double a = scanner.nextDouble();

        System.out.println(" nhập b:");
        double b = scanner.nextDouble();

        if (a != 0) {
            double kQ = -b / a;
            System.out.println(kQ);
        } else if (b == 0) {
            System.out.println(" jhj");
        }else {
            System.out.println(" ko có đáp án");
        }
    }
}
