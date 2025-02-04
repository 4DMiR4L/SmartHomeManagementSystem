package SmartHomeManagementSystem;

public class Light extends Device {

    public Light(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println(getId()+"turn on");
    }

    @Override
    public void turnOff() {
        System.out.println(getId()+"turn off");
    }
}
