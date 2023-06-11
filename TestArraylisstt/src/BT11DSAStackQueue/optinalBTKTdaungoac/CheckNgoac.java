package BT11DSAStackQueue.optinalBTKTdaungoac;

import java.util.Scanner;
import java.util.Stack;

public class CheckNgoac {
    public boolean ckeckDauNgoac(String str) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                bStack.push(str.charAt(i));
            }
            if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if (left=='(' && sym != ')'){
                    return false;
                }
            }

        }
        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CheckNgoac test = new CheckNgoac();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập biểu thức kiểm tra");
        String str = scanner.nextLine();
        if (test.ckeckDauNgoac(str)){
            System.out.println(str + " sử dụng ngoặc đúng cách");
        }else {
            System.out.println(str + " sử dụng ngoặc sai cách");
        }
    }
}
