package com.model.dto;

public class RideDTO implements java.io.Serializable {
    private int entranceCode;
    private String waitingTime;
    private int rideCode;
    private String rideSort;
    private String operationInfo;

    public RideDTO() {}

    public RideDTO(int entranceCode, String waitingTime, int rideCode, String rideSort, String operationInfo) {
        this.entranceCode = entranceCode;
        this.waitingTime = waitingTime;
        this.rideCode = rideCode;
        this.rideSort = rideSort;
        this.operationInfo = operationInfo;
    }

    public int getEntranceCode() {
        return entranceCode;
    }

    public void setEntranceCode(int entranceCode) {
        this.entranceCode = entranceCode;
    }

    public String getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(String waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getRideCode() {
        return rideCode;
    }

    public void setRideCode(int rideCode) {
        this.rideCode = rideCode;
    }

    public String getRideSort() {
        return rideSort;
    }

    public void setRideSort(String rideSort) {
        this.rideSort = rideSort;
    }

    public String getOperationInfo() {
        return operationInfo;
    }

    public void setOperationInfo(String operationInfo) {
        this.operationInfo = operationInfo;
    }

    @Override
    public String toString() {
        return "RideDTO{" +
                "entranceCode=" + entranceCode +
                ", waitingTime='" + waitingTime + '\'' +
                ", rideCode=" + rideCode +
                ", rideSort='" + rideSort + '\'' +
                ", operationInfo='" + operationInfo + '\'' +
                '}';
    }
}



