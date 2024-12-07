package class_2410_la83.week11_modularization.broken_modularization.before;

// broken modularization
// fowler -> data class, feature envy
// refactor -> move data or method
public class Device {
    private DeviceData deviceData;

    public void doRegister() {
        // any code here
        // ...
        deviceData.generateAllowedDeviceInfo();
        // ...
        // any code here
    }

}
