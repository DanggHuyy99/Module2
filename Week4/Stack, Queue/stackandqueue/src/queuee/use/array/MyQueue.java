package queuee.use.array;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean  status = false;
        if (currentSize == capacity) status = true;
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0) status = true;
        return status;
    }

    public void enqueue(int item){
        if (isQueueFull()) System.out.println("Nước tràn bờ đê, không thể thêm " + item);
        else {
            tail++;
            if (tail == capacity - 1) tail = 0;
            queueArr[tail] = item;
            currentSize++;
            System.out.println(item + " đã được thêm vào hàng đợi");
        }
    }

    public void dequeue(){
        if (isQueueEmpty()) System.out.println("Không có gì để mà xoá đâu cưng!!");
        else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Đã xoá " + queueArr[head - 1]);
                head = 0;
            }
            else System.out.println("Đã xoá" + queueArr[head - 1]);
            currentSize--;
        }
    }


}
