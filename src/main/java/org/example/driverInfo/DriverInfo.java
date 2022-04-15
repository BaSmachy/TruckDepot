package org.example.driverInfo;

public class DriverInfo {
    public String driverId;
    public String name;

    public DriverInfo() {
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DriverInfo{" +
                "driverId='" + driverId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
