package class_2410_la83.week11_modularization.broken_modularization.after;

public class Device {
    private String deviceId;
    private String devicePath;
    private String deviceName;
    private Boolean enabled;

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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void doRegister() {
        // any code here
        if (Boolean.TRUE.equals(this.enabled)) {
            // any code here
        }
        // any code here
    }
}
