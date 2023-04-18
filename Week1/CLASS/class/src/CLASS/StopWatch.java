package CLASS;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    public static void main(String[] args) {
        int[] arrays = new int[100000];
        Random rd = new Random();
        for (int i = 0; i < arrays.length; i++){
            arrays[i] = rd.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.Start();
        System.out.println("Thời gian chạy: " + stopWatch.getStartTime());
        selectionSort(arrays);
        for (int a:arrays) {
            System.out.print(a + ", ");
        }

        stopWatch.End();
        System.out.println("\nThời gian kết thúc: " + stopWatch.getEndTime());
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("\nElapsedTime: " + elapsedTime + " millíseconds");
    }

    public StopWatch() {
    }

    private long startTime;
    private long endTime;
    private boolean running;

    public void Start() {
        startTime = System.currentTimeMillis();
    }

    public void End() {
        endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }


    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
