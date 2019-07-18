package remote_control_homework.devices;

import remote_control_homework.devices.Device;

public class Projector extends Device {
    @Override
    public void turnOn() {
        System.out.println("Turns on the projector");
    }

    @Override
    public void turnOff() {
        System.out.println("Turns off the projector");
    }
}
