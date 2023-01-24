package devices;

public class Phone extends Device {
    @Override
    public void turnOn() {
        mode = true;
        System.out.println("włączono telefon");
    }

    @Override
    public String toString() {
        return "Phone{}";
    }
}
