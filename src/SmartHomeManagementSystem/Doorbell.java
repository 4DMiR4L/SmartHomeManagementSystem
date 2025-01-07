package SmartHomeManagementSystem;

public class Doorbell extends Device{
    public Doorbell(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
    public void ring(){}

}
