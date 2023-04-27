package demo.test;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(-2);
        for (int a:numbers) {
            System.out.println(a + " ");
        }
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        numbers.remove(0);
        for (int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
    }
}
