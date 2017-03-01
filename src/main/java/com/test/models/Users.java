package com.test.models;

/*
 * Created by Jeff Choi on 3/1/17.
 */
public class Users {
    private String ID, FName, LName, DOB, password;

    public Users() {
        this("","","","","");
    }

    public Users(String ID, String FName, String LName, String DOB, String password) {
        this.ID = ID;
        this.FName = FName;
        this.LName = LName;
        this.DOB = DOB;
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
