package com.webservice.queue.dto;

import java.util.Date;

public class PredictionDataUserDTO {
    private int inFront;
    private int averageTime;
    private String talonCode;
    private int talonNumber;
    private Date joinTime;

    public int getInFront() {
        return inFront;
    }

    public void setInFront(int inFront) {
        this.inFront = inFront;
    }

    public int getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(int averageTime) {
        this.averageTime = averageTime;
    }

    public String getTalonCode() {
        return talonCode;
    }

    public void setTalonCode(String talonCode) {
        this.talonCode = talonCode;
    }

    public int getTalonNumber() {
        return talonNumber;
    }

    public void setTalonNumber(int talonNumber) {
        this.talonNumber = talonNumber;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }
}
