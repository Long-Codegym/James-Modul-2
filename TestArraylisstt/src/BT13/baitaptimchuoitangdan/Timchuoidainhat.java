package BT13.baitaptimchuoitangdan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Timchuoidainhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập chuỗi:");
        String str = scanner.nextLine();
        LinkedList<Character> listmax = new LinkedList<>();
        listmax.add(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > listmax.getLast()) {
                listmax.addLast(str.charAt(i));
            }
        }
        for (Character listt:listmax
             ) {
            System.out.println(listt);
        }
    }
}

