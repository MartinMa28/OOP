package remote_control_homework.devices;

import remote_control_homework.devices.Device;

public class TV extends Device {
    @Override
    public void turnOn() {
        System.out.println("Turns on the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turns off the TV");
    }
}
