package demo.test;

import java.util.Arrays;

public class MyList<E> {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        System.out.println(integerMyList.size);
        System.out.println(integerMyList.DEFAULT_CAPACITY);
        integerMyList.add(10);
        integerMyList.add(1919);
        integerMyList.ensureCapa();
        System.out.println(integerMyList);

    }

    public int size = 0;
    public int DEFAULT_CAPACITY = 10;
    public Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E data) {
        if (size == element.length) ensureCapa();
        element[size++] = data;
    }

    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Out index");
        return (E) element[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                "}";
    }
}
