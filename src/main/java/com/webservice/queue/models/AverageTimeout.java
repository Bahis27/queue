package com.webservice.queue.models;

import javax.persistence.*;

@Entity
@Table(name = "averagetimeout")
public class AverageTimeout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "servicecode")
    private int serviceCode;

    @Column(name = "averagetime")
    private int averageTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(int averageTime) {
        this.averageTime = averageTime;
    }
}
