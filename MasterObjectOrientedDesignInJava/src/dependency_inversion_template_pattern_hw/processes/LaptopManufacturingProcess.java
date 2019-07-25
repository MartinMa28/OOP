package dependency_inversion_template_pattern_hw.processes;

import dependency_inversion_template_pattern_hw.processes.GeneralManufacturingProcess;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String name){
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("Tested laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaged laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Stored laptop");
    }
}
