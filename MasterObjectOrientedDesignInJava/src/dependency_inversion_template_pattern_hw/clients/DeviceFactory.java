package dependency_inversion_template_pattern_hw.clients;

import dependency_inversion_template_pattern_hw.processes.GeneralManufacturingProcess;
import dependency_inversion_template_pattern_hw.processes.SmartPhoneManufacturingProcess;
import dependency_inversion_template_pattern_hw.processes.LaptopManufacturingProcess;

public class DeviceFactory {
    public static void main(String args[]){
        GeneralManufacturingProcess iPhoneFacturingProcess = new SmartPhoneManufacturingProcess("iPhone process");
        GeneralManufacturingProcess xpsFacturingProcess = new LaptopManufacturingProcess("XPS process");

        iPhoneFacturingProcess.launchProcess();
        xpsFacturingProcess.launchProcess();
    }
}
