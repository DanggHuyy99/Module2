package zstatic.property;

public class Car {
    private String name;
    public String engine;
    public static int numberOfCar = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
}
