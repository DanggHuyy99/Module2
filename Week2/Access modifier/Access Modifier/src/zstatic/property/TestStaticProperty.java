package zstatic.property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car_1 = new Car("BMW" , "C++ 9.8");
        System.out.println(car_1.engine);
        System.out.println(Car.numberOfCar);
        Car car_2 = new Car("Mer", "JV 10.0");
        System.out.println(Car.numberOfCar);
        Car.numberOfCar = 10;
        System.out.println(Car.numberOfCar);
    }
}
