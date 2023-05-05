package countmap;

import java.util.HashMap;
import java.util.Map;

public class CountMap {
    public static void countMap(String string) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        String[] words = string.split(" ");

        for (String word : words) {
            word = word.toLowerCase();
            if (stringIntegerMap.containsKey(word)){
                int count = stringIntegerMap.get(word.toLowerCase());
                stringIntegerMap.put(word, count + 1);
            } else {
                stringIntegerMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry:stringIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
