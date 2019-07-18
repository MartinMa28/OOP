package remote_control_homework.devices;

import remote_control_homework.devices.Device;

public class SurroundSoundSystem extends Device {
    @Override
    public void turnOn() {
        System.out.println("Turns on the Sur-Sound system");
    }

    @Override
    public void turnOff() {
        System.out.println("Turns off the Sur-Sound system");
    }
}
