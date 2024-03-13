package com.model.dto;

public class RideDTO implements java.io.Serializable{
    private int rideCode;
    private int entranceCode;
    private String rideSort;
    private String watingTime;
    private String operationInfo;

    public RideDTO() {}

    public RideDTO(int rideCode, int entranceCode, String rideSort, String watingTime, String operationInfo) {
        this.rideCode = rideCode;
        this.entranceCode = entranceCode;
        this.rideSort = rideSort;
        this.watingTime = watingTime;
        this.operationInfo = operationInfo;
    }

    public int getRideCode() {
        return rideCode;
    }

    public void setRideCode(int rideCode) {
        this.rideCode = rideCode;
    }

    public int getEntranceCode() {
        return entranceCode;
    }

    public void setEntranceCode(int entranceCode) {
        this.entranceCode = entranceCode;
    }

    public String getRideSort() {
        return rideSort;
    }

    public void setRideSort(String rideSort) {
        this.rideSort = rideSort;
    }

    public String getWatingTime() {
        return watingTime;
    }

    public void setWatingTime(String watingTime) {
        this.watingTime = watingTime;
    }

    public String getOperationInfo() {
        return operationInfo;
    }

    public void setOperationInfo(String operationInfo) {
        this.operationInfo = operationInfo;
    }

    @Override
    public String toString() {
        return "ride_info{" +
                "rideCode=" + rideCode +
                ", entranceCode=" + entranceCode +
                ", rideSort='" + rideSort + '\'' +
                ", watingTime='" + watingTime + '\'' +
                ", operationInfo='" + operationInfo + '\'' +
                '}';
    }
}
