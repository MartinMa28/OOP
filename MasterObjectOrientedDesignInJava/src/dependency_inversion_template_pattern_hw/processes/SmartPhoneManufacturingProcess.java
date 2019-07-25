package dependency_inversion_template_pattern_hw.processes;

import dependency_inversion_template_pattern_hw.processes.GeneralManufacturingProcess;

public class SmartPhoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartPhoneManufacturingProcess(String name){
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled smart phone");
    }

    @Override
    protected void testDevice() {
        System.out.println("Tested smart phone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaged smart phone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Stored smart phone");
    }
}
