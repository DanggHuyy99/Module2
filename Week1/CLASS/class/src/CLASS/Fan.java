package CLASS;

import java.util.Scanner;

public class Fan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed;
        String color;
        double radius;


        Fan fan = new Fan();
        int choose;
        do {
            System.out.println("Bạn muốn bật quạt không ?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    scanner = new Scanner(System.in);
                    System.out.println("Enter speed:");
                    speed = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter color:");
                    color = scanner.nextLine();

                    System.out.println("Enter radius:");
                    radius = scanner.nextDouble();
                    fan.fanOn();
                    fan.setSpeed(speed);
                    fan.setRadius(radius);
                    fan.setColor(color);
                    System.out.println(fan.toString());
                    break;
                case 2:
                    fan.fanOff();
                    System.out.println(fan.toString());
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;

            }
        } while (choose != 1);

//        fan.fanOn();
//        fan.setSpeed(speed);
//        fan.setRadius(radius);
//        fan.setColor(color);
//        System.out.println(fan.toString());

    }


    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public void setMaxSpeed(){
        this.speed = FAST;
    }

    public void setAverageSpeed(){
        this.speed = MEDIUM;
    }

    public void setMinSpeed(){
        this.speed = SLOW;
    }
    public Fan() {
        radius = 5;
        color = "Blue";
    }

    public void fanOn() {
        on = true;
    }

    public void fanOff() {
        on = false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        if (on == true && speed == FAST)
            return "Fan is on" + " with speed: " + "FAST" + " , color: " + color + " , radius: " + radius;
        else if (on == true && speed == MEDIUM)
            return "Fan is on" + " with speed: " + "MEDIUM" + " , color: " + color + " , radius: " + radius;
        else if (on == true && speed == SLOW)
            return "Fan is on" + " with speed: " + "SLOW" + " , color: " + color + " , radius: " + radius;
        else if (on == true && speed < 0 || speed > 3)
            return "Invalid value";
        else
            return "Fan is off, color: " + color + " , radius: " + radius;

    }
}
