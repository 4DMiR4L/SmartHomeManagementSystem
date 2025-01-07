package SmartHomeManagementSystem;

public class Tesmostat extends Device {

    public Tesmostat(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println(getId() + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getId() + " turned off");
    }

    public void setTemperature(int temperature) {
        System.out.println(" sets temperature " + temperature);
    }
}
