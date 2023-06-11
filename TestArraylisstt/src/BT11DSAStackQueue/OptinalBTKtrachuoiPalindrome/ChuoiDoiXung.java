package BT11DSAStackQueue.OptinalBTKtrachuoiPalindrome;
import BT11DSAStackQueue.MyQueue;

import java.util.Scanner;
import java.util.Stack;

public class ChuoiDoiXung {
    //kiểm tra chuỗi truyền vào tham số
    public boolean checkPalindrome(String str){
        MyQueue<Character> queue= new MyQueue<>();
        Stack<Character> stack= new Stack<>();
        for (int i = 0; i< str.length(); i++){
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }

        if (queue.remove() != stack.pop()){
            return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChuoiDoiXung kTDX = new ChuoiDoiXung();
        System.out.println(" nhập chuỗi:");
        String str = scanner.nextLine();
        if (kTDX.checkPalindrome(str)){
            System.out.println(str + " là chuỗi đối xứng.");
        }else {
            System.out.println(str + " không phải là chuỗi đối xứng.");
        }
    }
}
