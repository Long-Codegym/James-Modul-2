package BT11DSAStackQueue.THStackUseLinkedList.controller;

import BT11DSAStackQueue.THStackUseLinkedList.model.MyGeneriStack;

public class GenericStackClient {

    private static void stackOfString(){
        MyGeneriStack<String> stack = new MyGeneriStack();
        stack.push(" Vlamdimir");
        stack.push("Long");
        System.out.println(" Độ dài: " + stack.size());
        System.out.println(" Pop elements form stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println( "Size of stack after pop operations : " + stack.size());
    }
    private static void stackOfinteger(){
        MyGeneriStack<Integer> stack = new MyGeneriStack<>();
        stack.push(43);
        stack.push(24);
        stack.push(27);
        stack.push(7749);
        System.out.println(" Độ dài: " + stack.size());
        System.out.println(" Pop elements form stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println( "Size of stack after pop operations : " + stack.size());
    }


    public static void main(String[] args) {
        System.out.println(" stack of String: ");
        stackOfString();
        System.out.println(" stack of Integer: ");
        stackOfinteger();
    }
}
