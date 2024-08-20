/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevMonitor;

/**
 *
 * @author Yaye
 */
public class Device {
    private int DeviceID;
    private String DeviceName;
    private String DeviceType;
    private boolean OutOfUse;

    public Device(int DeviceID, String DeviceName, String DeviceType, boolean OutOfUse) {
        this.DeviceID = DeviceID;
        this.DeviceName = DeviceName;
        this.DeviceType = DeviceType;
        this.OutOfUse = OutOfUse;
    }

    public int getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(int DeviceID) {
        this.DeviceID = DeviceID;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public boolean isOutOfUse() {
        return OutOfUse;
    }

    public void setOutOfUse(boolean OutOfUse) {
        this.OutOfUse = OutOfUse;
    }

   

    
}
