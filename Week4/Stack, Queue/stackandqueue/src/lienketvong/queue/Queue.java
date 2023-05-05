package lienketvong.queue;

public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()){
            front = rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    public int deQueue(){
        int data;
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            data = front.data;
            if (front == rear){
                front = null;
                rear = null;
            } else {
                front = front.link;
                rear.link = front;
            }
        }
        return data;
    }
}
