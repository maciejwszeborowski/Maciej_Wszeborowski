package devices;

public class Car {
    public int value;
    int wheels;
    int mileage;
    public String model;
    public String producer;

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
