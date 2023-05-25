package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> sinhVien = new HashMap<>();
        sinhVien.put("Spiderman", 44);
        sinhVien.put("slendermeeee", 99);
        System.out.println("Hashmap");
        System.out.println(sinhVien + "\t");

        for (String key : sinhVien.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sinhVien.get(key));
        }

        for (Map.Entry<String, Integer> entry: sinhVien.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Iterator<String> iterator = sinhVien.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("Key: " + key + ", value: " + sinhVien.get(key));
        }

        Iterator<Map.Entry<String, Integer>> entryIterator = sinhVien.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> key = entryIterator.next();
            System.out.println("Key: " + key.getKey() + ", value: " + key.getValue());
        }

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 075f, true);
        linkedHashMap.put("John Cena", 45);
        linkedHashMap.put("Thor", 456);
        System.out.println("John Cena" + linkedHashMap.get("John Cena"));
    }

}
