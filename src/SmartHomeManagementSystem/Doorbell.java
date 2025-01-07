package SmartHomeManagementSystem;

public class Doorbell extends Device{
    public Doorbell(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println(getId()+"Doorbell turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getId()+"Doorbell turned off");

    }
    public void ring(){
        System.out.println("Doorbell ring on");
    }

}
