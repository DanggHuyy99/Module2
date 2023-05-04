package linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    public static void main(String[] args) {
        stackOfIntegers();
        stackOfString();
    }
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size() == 0) return true;
        return false;
    }

    public static void stackOfIntegers(){
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(4);
        myGenericStack.push(9);
        myGenericStack.push(8);
        System.out.println("Size of stack after push operations: " + myGenericStack.size());
        System.out.println("Pop elements from stack : ");
        while (!myGenericStack.isEmpty()){
            System.out.print(myGenericStack.pop() + " ");
        }
        System.out.println();
        System.out.println("Size of stack after pop operations : " + myGenericStack.size());
    }

    public static void stackOfString(){
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("Ta là chúa quỷ");
        myGenericStack.push("Trời ơi");
        myGenericStack.push("Oh My Ghost ♥");
        System.out.println("Size of stack after push operations: " + myGenericStack.size());
        System.out.println("Pop elements from stack : ");
        while (!myGenericStack.isEmpty()){
            System.out.print(myGenericStack.pop() + " ");
        }
        System.out.println();
        System.out.println("Size of stack after pop operations : " + myGenericStack.size());
    }
}
