package BT11DSAStackQueue.bt11optional.OptionalTHQueueArray.model;

public class MyQueue {
    private int capactity;
    private int[] queueArr;
    private int currentSize = 0;
    private int  tail= -1;

    public MyQueue(int queueSize) {
        this.capactity = queueSize;
        queueArr = new int[this.capactity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item){
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }
    public void dequeue(){

    }
}
