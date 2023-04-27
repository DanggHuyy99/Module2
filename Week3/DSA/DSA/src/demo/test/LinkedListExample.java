package demo.test;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> numbers = new LinkedList<>();
        numbers.add("MewTwo");
        numbers.add("Charizard");
        numbers.add("Rayquaza");
        for (String a:numbers) {
            System.out.print(a + " ");
        }
        System.out.println();
        numbers.addFirst("Ta là Cá Sấu");
        for (String a:numbers) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(numbers.indexOf("Ta là Cá Sấu"));
    }


}
