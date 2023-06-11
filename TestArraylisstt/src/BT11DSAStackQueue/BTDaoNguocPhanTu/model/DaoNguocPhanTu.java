package BT11DSAStackQueue.BTDaoNguocPhanTu.model;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    Scanner sc = new Scanner(System.in);

    public Stack<Character> getElement() {
        Stack<Character> stack = new Stack<>();
        System.out.println(" nhập chuỗi cần đảo ngược: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        return stack;
    }

}
