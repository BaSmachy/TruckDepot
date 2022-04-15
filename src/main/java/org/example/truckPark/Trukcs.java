package org.example.truckPark;

import org.example.driverInfo.DriverInfo;

public class Trukcs {
    private int id;
    private String name;
    private String driver;
    private String state;
    public DriverInfo dInfo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DriverInfo getdInfo() {
        return dInfo;
    }

    public void setdInfo(DriverInfo dInfo) {
        this.dInfo = dInfo;
    }

    @Override
    public String toString() {
        return "TruksPark{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver='" + driver + '\'' +
                ", state='" + state + '\'' +
                ", dInfo=" + dInfo +
                '}';
    }
}
