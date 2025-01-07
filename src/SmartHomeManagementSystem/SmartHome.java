package SmartHomeManagementSystem;

import java.util.List;

public class SmartHome implements Management {
    private List<User> users;
    private List<Device> devices;

    public SmartHome() {}

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public Device getDeviceStatus(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                return device;
            }
        }
        return null;
    }


    @Override
    public void addDevice(Device device) {

    }

    @Override
    public void removeDevice(Device device) {

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
