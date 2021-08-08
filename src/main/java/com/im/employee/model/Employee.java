package com.im.employee.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table
public class Employee {

    @Id
    @Column
    private int id;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private BigInteger number;
    @Column
    private String country;
    @Column
    private String state;

    @Column
    private int pinCode;
    @Column
    private String landmark;
    @Column
    private String reportingManager;
    @Column
    private String department;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }





    public int getpinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +

                ", pinCode=" + pinCode +
                ", landmark='" + landmark + '\'' +
                ", reportingManager='" + reportingManager + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
