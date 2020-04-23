package com.example.fitnessapp.user;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.Date;
import java.util.Dictionary;
import java.util.List;

public class User implements Serializable {

    private String name;
    private String nextMeet;
    private String integrationCode;
    private Date bDay;
    private double height;
    private String job;
    private String phoneNumber;
    private String email;
    private String registerEmail;
    private String goal;
    private String limitation;
    private List<Day> days;
    private DietProcessTab dietTable;
    private Diet diet;
    private Dictionary<String, ProductDataBase> productDataBase;

    public User(String name, String nextMeet, String integrationCode, Date bDay, double height, String job, String phoneNumber, String email, String registerEmail, String goal, String limitation, List<Day> days, DietProcessTab dietTable, Diet diet, Dictionary<String, ProductDataBase> productDataBase) {
        this.name = name;
        this.nextMeet = nextMeet;
        this.integrationCode = integrationCode;
        this.bDay = bDay;
        this.height = height;
        this.job = job;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registerEmail = registerEmail;
        this.goal = goal;
        this.limitation = limitation;
        this.days = days;
        this.dietTable = dietTable;
        this.diet = diet;
        this.productDataBase = productDataBase;
    }

    public String getNextMeet() {
        return nextMeet;
    }

    public void setNextMeet(String nextMeet) {
        this.nextMeet = nextMeet;
    }

    public Dictionary<String, ProductDataBase> getProductDataBase() {
        return productDataBase;
    }
    public void setProductDataBase(Dictionary<String, ProductDataBase> productDataBase) {
        this.productDataBase = productDataBase;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIntegrationCode() {
        return integrationCode;
    }
    public void setIntegrationCode(String integrationCode) {
        this.integrationCode = integrationCode;
    }
    public Date getbDay() {
        return bDay;
    }
    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRegisterEmail() {
        return registerEmail;
    }
    public void setRegisterEmail(String registerEmail) {
        this.registerEmail = registerEmail;
    }
    public String getGoal() {
        return goal;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
    public String getLimitation() {
        return limitation;
    }
    public void setLimitation(String limitation) {
        this.limitation = limitation;
    }
    public List<Day> getDays() {
        return days;
    }
    public void setDays(List<Day> days) {
        this.days = days;
    }
    public DietProcessTab getDietTable() {
        return dietTable;
    }
    public void setDietTable(DietProcessTab dietTable) {
        this.dietTable = dietTable;
    }
    public Diet getDiet() {
        return diet;
    }
    public void setDiet(Diet diet) {
        this.diet = diet;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", nextMeet='" + nextMeet + '\'' +
                ", integrationCode='" + integrationCode + '\'' +
                ", bDay=" + bDay +
                ", height=" + height +
                ", job='" + job + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", registerEmail='" + registerEmail + '\'' +
                ", goal='" + goal + '\'' +
                ", limitation='" + limitation + '\'' +
                ", days=" + days +
                ", dietTable=" + dietTable +
                ", diet=" + diet +
                ", productDataBase=" + productDataBase +
                '}';
    }
}

