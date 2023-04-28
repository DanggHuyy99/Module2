package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo<E> {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0, 99);
        ll.add(1,555);
        ll.add(2, 10);
        System.out.println(ll);
        System.out.println(ll.get(1));
    }

    public class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public LinkedListDemo() {
    }

    public void add(int index, Object data) {
        if (index < 0 || index > numNodes)
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + numNodes);
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        Node holder = new Node(data);

        if (head == null) {
            head = holder;
            numNodes++;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = holder;
        numNodes++;
    }

    public Node get(int index){
        if (index < 0 || index > numNodes) throw new IndexOutOfBoundsException("Index: " + index + ", size:" + numNodes);
        Node temp = head;
        for (int i =0; i < index-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedListDemo{" +
                "head=" + head +
                ", numNodes=" + numNodes +
                '}';
    }
}

