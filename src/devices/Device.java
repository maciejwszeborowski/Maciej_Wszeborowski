package devices;

public abstract class Device {
    public String producer;
    int yearOfProduction;
    boolean mode;
public abstract void turnOn();
    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", mode=" + mode +
                '}';

    }
}
