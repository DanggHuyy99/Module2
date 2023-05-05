package stackk.use.array;

public class MyStack {
    private int arr[];

    private int size;

    private int index = 0;

    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull(){
        if (index == size) return true;
        return false;
    }

    public boolean isEmpty(){
        if (index == 0) return true;
        return false;
    }

    public int size(){
        return index;
    }
    public void push(int element){
        if (isFull()) throw new StackOverflowError("Đầy rồi còn đâu");
        arr[index] = element;
        index++;
    }

    public int pop(){
        if (isEmpty()) throw new StackOverflowError("Nhà còn gì đâu mà xoá");
        return arr[--index];
    }
}
