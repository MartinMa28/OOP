package remote_control_homework;

import remote_control_homework.devices.Projector;
import remote_control_homework.devices.SurroundSoundSystem;
import remote_control_homework.devices.TV;

public class Person {
    public static void main(String[] args){
        Projector proj = new Projector();
        TV tv = new TV();
        SurroundSoundSystem sss = new SurroundSoundSystem();

        RemoteControl remControl = RemoteControl.getInstance();
        remControl.connectToDevice(proj);
        remControl.turnDeviceOn();
        remControl.turnDeviceOff();

        remControl.connectToDevice(tv);
        remControl.turnDeviceOn();
        remControl.turnDeviceOff();

        remControl.connectToDevice(sss);
        remControl.turnDeviceOn();
        remControl.turnDeviceOff();
    }
}
