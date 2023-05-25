package ex6;

public class CheckArrayAInArrayB {
    public boolean checkArrayAInArrayB(int[] arrayA, int[] arrayB){
        boolean checkIn = true;
        for (int i = 0; i < arrayA.length; i++){
            boolean check = false;
            for (int j = 0; j < arrayB.length; j++){
                if (arrayA[i] == arrayB[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                checkIn = false;
                break;
            }
        }
        return checkIn;
    }
}
