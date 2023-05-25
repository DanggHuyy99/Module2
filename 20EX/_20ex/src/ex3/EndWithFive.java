package ex3;

public class EndWithFive {
    public void checkEndWithFive(int[] array){
        int count = 0;
        for (int i = 0 ; i < array.length; i++){
            if (array[i] % 10 == 5){
                System.out.println("Vị trí tại " + i + " tận cùng bằng 5: " + array[i]);
                count++;
            }
        }
        System.out.println("Tổng các giá trị tận cùng bằng 5 là: " + count);
    }
}
