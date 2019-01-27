package com.webservice.queue.dto;

public class EmployeeEstimationDTO {
    private String lastName;
    private String firstName;
    private String middleName;
    private double averageEstimation;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageEstimation() {
        return averageEstimation;
    }

    public void setAverageEstimation(double averageEstimation) {
        this.averageEstimation = averageEstimation;
    }
}
