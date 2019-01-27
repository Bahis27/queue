package com.webservice.queue.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "queue")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "averagetimeoutid")
    private AverageTimeout averageTimeout;

    @Column(name = "departmentcode")
    private int departmentCode;

    @Column(name = "operationindex")
    private String operationIndex;

    @Column(name = "queueno")
    private int queueNo;

    @Column(name = "jointime")
    private Date joinTime;

    @Column(name = "codestatus")
    private int codeStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AverageTimeout getAverageTimeout() {
        return averageTimeout;
    }

    public void setAverageTimeout(AverageTimeout averageTimeout) {
        this.averageTimeout = averageTimeout;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getOperationIndex() {
        return operationIndex;
    }

    public void setOperationIndex(String operationIndex) {
        this.operationIndex = operationIndex;
    }

    public int getQueueNo() {
        return queueNo;
    }

    public void setQueueNo(int queueNo) {
        this.queueNo = queueNo;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public int getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(int codeStatus) {
        this.codeStatus = codeStatus;
    }
}
