package ARRAYLIST;

import java.util.Arrays;

public class MyList<E> {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println(myList.size);
        myList.add(4);
        myList.add(9);
        System.out.println(myList);
        myList.add(0, 9);
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
        System.out.println(myList.size);
        System.out.println(myList.Clone());
        System.out.println(myList.contains(8));
        System.out.println(myList.indexOf(9));
    }
    private int size = 0;

    static final int DEFAULT_CAPACITY = 10;

    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public void addElement(E element) {
        if (size == elements.length) ensureCapacity();
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index : " + index + ", Size: " + size);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[size++] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index : " + index + ", Size: " + size);
        E removeElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) System.arraycopy(elements, index + 1, elements, index, numMoved);
        elements[--size] = null;
        return removeElement;
    }

    public int size() {
        return size;
    }

    public E Clone() {
        MyList<E> cloneList = new MyList<>(size);
        System.arraycopy(elements, 0, cloneList.elements, 0, size);
        cloneList.size = size;
        return (E) cloneList;
    }

    public boolean contains(E object) {
        return indexOf(object) >= 0;
    }

    public int indexOf(E object) {
        if (object == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (object.equals(elements[i])) return i;
            }
        }
        return -1;
    }

    public boolean add(E object) {
        ensureCapacity();
        elements[size++] = object;
        return true;
    }




    public E get(int i) {
        if (i < 0 || i > size) throw new IndexOutOfBoundsException("Index : " + i + ", Size: " + size);
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
