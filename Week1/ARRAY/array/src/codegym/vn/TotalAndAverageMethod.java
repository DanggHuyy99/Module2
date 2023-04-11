package codegym.vn;

public class TotalAndAverageMethod {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        int tong = 0;
        int nhan = 1;
        int count = 0;
        double trung_binh = 0;
        for (int i = 0; i < arr.length; i += 2){
            if (arr[i] % 2 == 1){
                System.out.println();
                System.out.println("Số lẻ ở vị trí thứ " + i + ": " + arr[i]);
                tong = total(tong, arr[i]);
                nhan = mutiplication(nhan, arr[i]);
                count++;
            }
        }
        trung_binh = (double) average(tong, count);

        System.out.printf("Tổng: %d\n", tong);
        System.out.printf("Tích: %d\n", nhan);
        System.out.printf("Giá trị trung bình: %.2f\n", trung_binh);


    }
    public static int total(int a, int b){
        int result;
        result = a + b;
        return result;
    }

    public static int mutiplication(int a, int b){
        int result;
        result = a * b;
        return result;
    }

    public static int average(int a, int b){
        int result;
        result = a / b;
        return result;
    }
}
