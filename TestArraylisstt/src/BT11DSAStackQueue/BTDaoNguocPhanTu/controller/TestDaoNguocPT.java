package BT11DSAStackQueue.BTDaoNguocPhanTu.controller;

import BT11DSAStackQueue.BTDaoNguocPhanTu.model.DaoNguocPhanTu;

import java.util.Scanner;
import java.util.Stack;

public class TestDaoNguocPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaoNguocPhanTu test = new DaoNguocPhanTu();
//        Stack<Character> tesst = test.getElement();
//        while (!tesst.isEmpty()){
//            System.out.print(tesst.pop());
//        }
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                Stack<Character> tesst = test.getElement(); //Stack <Kiểu dữ liệu > tên biến = tên đối tượng.tên phương thức
                while (!tesst.isEmpty()) {
                    System.out.print(tesst.pop());
                }
        }

    }
}
