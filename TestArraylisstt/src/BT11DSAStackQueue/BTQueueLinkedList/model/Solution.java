package BT11DSAStackQueue.BTQueueLinkedList.model;

public class Solution {
    private Queue queue;
    public void enqueue(int data) {
        Node  node = new Node(data);
        if (queue.front == null){
            queue.front = queue.rear= node;
        }
        queue.rear.link = node;
        queue.rear = node;
    }
    public Node dequeue(){
        if (queue.front == null){
            return null;
        }
        Node temp = queue.front;
        queue.front = queue.front.link;
        if (queue.front == null){
            queue.rear = null;
        }
        return temp;
    }
}
