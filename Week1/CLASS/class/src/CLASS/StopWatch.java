package CLASS;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    public static void main(String[] args) {
        int[] arrays = new int[100000];
        for (int i = 0; i < arrays.length; i++){
            arrays[i] = i+1;
            System.out.print(arrays[i] + ",");
        }
        StopWatch sw = new StopWatch();
        sw.Start();
        sw.End();
        sw.getElapsedTime();
        System.out.println();
        System.out.println(sw.toString());
    }

    public StopWatch() {
    }

    private long startTime;
    private long endTime;
    private boolean running;

    public void Start() {
        this.startTime = System.nanoTime();
        System.out.println(System.nanoTime());
        this.running = true;
    }

    public void End() {
        this.endTime = System.nanoTime();
        System.out.println(System.nanoTime());
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime);
        }
        else {
            elapsed = (endTime - startTime);
        }
        return elapsed;
    }

    public String toString() {
        long elapsed = getElapsedTime();
        long hours = TimeUnit.NANOSECONDS.toHours(elapsed);
        long minutes = TimeUnit.NANOSECONDS.toMinutes(elapsed) - TimeUnit.HOURS.toMinutes(hours);
        long seconds = TimeUnit.NANOSECONDS.toSeconds(elapsed) - TimeUnit.MINUTES.toSeconds(minutes) - TimeUnit.HOURS.toSeconds(hours);
        long milliseconds = TimeUnit.NANOSECONDS.toMillis(elapsed) - TimeUnit.SECONDS.toMillis(seconds) - TimeUnit.MINUTES.toMillis(minutes) - TimeUnit.HOURS.toMillis(hours);

        return String.format("%02d:%02d:%02d:%03d", hours, minutes, seconds, milliseconds);
    }
}
