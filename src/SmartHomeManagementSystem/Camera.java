package SmartHomeManagementSystem;

public class Camera extends Device {
    public Camera(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
    public void startRecording() {}
    public void stopRecording() {}

}
