package com.webservice.queue.models;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Estimation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="lastname")
    private String lastName;

    @Column(name="firstname")
    private String firstName;

    @Column(name="middlename")
    private String middleName;

    @Column(name="numbergoodestimation")
    private int numberGoodEstimation;

    @Column(name="numberbadestimation")
    private int numberBadEstimation;

    @Column(name="numbermiddleestimation")
    private int numberMiddleEstimation;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getNumberGoodEstimation() {
        return numberGoodEstimation;
    }

    public int getNumberMiddleEstimation() {
        return numberMiddleEstimation;
    }

    public int getNumberBadEstimation() {
        return numberBadEstimation;
    }

    public void setNumberGoodEstimation(int numberGoodEstimation) {
        this.numberGoodEstimation = numberGoodEstimation;
    }

    public void setNumberMiddleEstimation(int numberMiddleEstimation) {
        this.numberMiddleEstimation = numberMiddleEstimation;
    }

    public void setNumberBadEstimation(int numberBadEstimation) {
        this.numberBadEstimation = numberBadEstimation;
    }
}
