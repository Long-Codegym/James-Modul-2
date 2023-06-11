package BT11DSAStackQueue.optionalTHStack;

public class MyStack {
    private int[] arr;
    private int size;
    private int index;

    public MyStack(int size) {
    this.size = size;
    arr = new int[size];
    }
    public int size(){
        return  index;
    }
    public boolean isFull(){  // kiểm tra đã đầy hay chưa
        if (index == size){
            return true;
        }
        return false;
    }

    // kiểm tra xem có rỗng ko
    public boolean isEmpty(){
        if (index == 0){

        }
        return false;
    }

    //  thêm phần tử vào
    public void push(int element) throws Exception {
       if (isFull()){
           throw new Exception(" đầy");
       }
       arr[index] = element;
       index++;
    }

    // xóa phần tử
    public int pop() throws Exception {
        if (isFull()){
            throw new Exception("đầy");
        }
        return arr[--index];
    }

}
