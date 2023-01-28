package devices;

public abstract class Car extends Device {
    public int value;
    int wheels;
    int mileage;
    public String model;

    public abstract void refuel();

    @Override
    public void turnOn() {
        mode = true;
        System.out.println("samochód włączono");

    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", wheels=" + wheels +
                ", mileage=" + mileage +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
