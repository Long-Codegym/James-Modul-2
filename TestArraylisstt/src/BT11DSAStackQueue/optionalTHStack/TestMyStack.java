package BT11DSAStackQueue.optionalTHStack;

public class TestMyStack {
    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(1);
        stack.push(9);
        stack.push(9);
        stack.push(9);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
