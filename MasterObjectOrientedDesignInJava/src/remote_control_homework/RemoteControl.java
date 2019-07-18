package remote_control_homework;

import remote_control_homework.devices.Device;

public class RemoteControl {
    private Device device = null;
    private static RemoteControl remoteControl = null;

    private RemoteControl(){

    }

    public static RemoteControl getInstance(){
        if(RemoteControl.remoteControl == null){
            RemoteControl.remoteControl = new RemoteControl();
        }

        return RemoteControl.remoteControl;
    }

    public void connectToDevice(Device device){
        this.device = device;
    }

    public void turnDeviceOn(){
        this.device.turnOn();
    }

    public void turnDeviceOff(){
        this.device.turnOff();
    }
}
