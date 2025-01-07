package SmartHomeManagementSystem;

public class Camera extends Device {
    public Camera(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {
        System.out.println(getId() + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getId()+ " turned off");
    }
    public void startRecording() {
        System.out.println(" starting recording");
    }
    public void stopRecording() {
        System.out.println(" stopping recording");
    }

}
