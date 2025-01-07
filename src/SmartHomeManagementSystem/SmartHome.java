package SmartHomeManagementSystem;

import java.sql.SQLOutput;
import java.util.List;

public class SmartHome implements Management {
    private List<User> users;
    private List<Device> devices;

    public SmartHome() {}

    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getFirstName() + " added to SmartHome");
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println(user.getFirstName() + " removed from SmartHome");
    }

    public Device getDeviceStatus(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                System.out.println(device.getName() + " has been added to SmartHome"+(device.getStatus() ?"on":"of"));
                return device;
            }
        }
        return null;
    }


    @Override
    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getName() + " added to SmartHome");
    }

    @Override
    public void removeDevice(Device device) {
        devices.remove(device);
        System.out.println(device.getName() + " removed from SmartHome");
    }

    public List<User> getUsers() {

        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
