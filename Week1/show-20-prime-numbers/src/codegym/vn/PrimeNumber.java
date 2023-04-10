package codegym.vn;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 2;
        while (i < 100){
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++){
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(i);
            }
            i++;
        }
    }
}
