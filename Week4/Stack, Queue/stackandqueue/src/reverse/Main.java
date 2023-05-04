package reverse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,8,9,799,1,545};
        Reverse.reverse(array);
        System.out.println(Arrays.toString(array));

    }
}
