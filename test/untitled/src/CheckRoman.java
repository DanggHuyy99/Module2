import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRoman {

    public int enterRoman(String roman) {
        Map<Character, Integer> romanToNumber = new HashMap<>();
        romanToNumber.put('I', 1);
        romanToNumber.put('V', 5);
        romanToNumber.put('X', 10);
        romanToNumber.put('L', 50);
        romanToNumber.put('C', 100);
        romanToNumber.put('D', 500);
        romanToNumber.put('M', 1000);

        int number = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char romanChart = roman.charAt(i);
            int currentValue = romanToNumber.get(romanChart);

            if (currentValue >= prevValue) {
                number += currentValue;
            } else {
                number -= currentValue;
            }
            prevValue = currentValue;
        }
        return number;
    }

    public  String InputString(){
        String roman;
        Scanner scanner = new Scanner(System.in);
        String regex = "^(M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})|[0-3]?[0-9]{1,3})$";
        Pattern pattern = Pattern.compile(regex);
        while (true) {
            try {
                System.out.println("Nhập 1 chuỗi");
                roman = scanner.nextLine();
                if (roman.isEmpty()) throw new IllegalArgumentException("Chuỗi không được để rỗng");
                Matcher matcher = pattern.matcher(roman);
                if (matcher.matches()) break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nhập sai. Nhập lại");
            }
        }
        return roman;
    }
}

