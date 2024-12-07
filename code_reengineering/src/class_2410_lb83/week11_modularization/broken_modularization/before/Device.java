package class_2410_lb83.week11_modularization.broken_modularization.before;

// Broken modularization
// This smell arises when data and/or methods that ideally should have been localized
// into a single abstraction are separated and spread across multiple abstractions.
// - Classes that are used as a holder for data but have no methods operating on the data within that class. (Fowler : Data Class)
// - Methods in a class that are more interested in members of other classes. (Fowler : Feature envy)
// Fowler : data class / feature envy
public class Device {
    private DeviceData deviceData;

    public DeviceData getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(DeviceData deviceData) {
        this.deviceData = deviceData;
    }

    public void doRegistrationDevice() {
        // any code here
        // ...
        deviceData.generateAllowedDevice();
        // ...
        // any code here
    }
}
