package BT11DSAStackQueue.opionalBTnhiphan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiTPsagNhiPhan {
   public static Stack tPsangNP(int number){
       Stack<Integer> stack = new Stack<>();
       while (number >0 ){
           stack.push(number%2);
           number = number/2;
       }
       return stack;
   }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ChuyenDoiTPsagNhiPhan chuyenDoiTPsagNhiPhan = new ChuyenDoiTPsagNhiPhan();
        System.out.println(" nhập số cần chuyển sang nhị phân");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number + " chuyển sang nhị phân là");
        Stack stack = ChuyenDoiTPsagNhiPhan.tPsangNP(number);
                while (!stack.isEmpty()){;;
            System.out.print(stack.pop());
        }
    }
}
