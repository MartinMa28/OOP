package dependency_inversion_template_pattern_hw.processes;

public abstract class GeneralManufacturingProcess {
    private String processName;

    public GeneralManufacturingProcess(String name){
        this.processName = name;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    // template method
    public void launchProcess(){
        if(this.processName != null && !this.processName.isEmpty()){
            this.assembleDevice();
            this.testDevice();
            this.packageDevice();
            this.storeDevice();
        } else {
            System.out.println("No process name was defined.");
        }
    }
}
