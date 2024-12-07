package class_2410_lb83.week11_modularization.broken_modularization.before;

public class DeviceData {
    private String deviceId;
    private String devicePath;
    private String deviceName;
    private String deviceSource;
    private Boolean enabled;

    // broken (fowler feature envy)
    public void generateAllowedDevice() {
        // any code here
        if (Boolean.TRUE.equals(enabled)) {
            // any code here
        }
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceSource() {
        return deviceSource;
    }

    public void setDeviceSource(String deviceSource) {
        this.deviceSource = deviceSource;
    }
}
