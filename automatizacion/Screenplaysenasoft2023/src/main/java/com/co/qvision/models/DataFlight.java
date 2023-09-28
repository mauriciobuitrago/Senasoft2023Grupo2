package com.co.qvision.models;

public class DataFlight {
    private String email;
    private String phone;
    private String name;
    private String lastname;
    private String dayT;
    private String year;
    private String nametarget;
    private  String nambertarget;
    private String day;
    private String cvc;

    public DataFlight(String email, String phone, String name, String lastname, String dayT, String year, String nametarget, String nambertarget, String day, String cvc) {
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.lastname = lastname;
        this.dayT = dayT;
        this.year = year;
        this.nametarget = nametarget;
        this.nambertarget = nambertarget;
        this.day = day;
        this.cvc = cvc;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNametarget() {
        return nametarget;
    }

    public void setNametarget(String nametarget) {
        this.nametarget = nametarget;
    }

    public String getNambertarget() {
        return nambertarget;
    }

    public void setNambertarget(String nambertarget) {
        this.nambertarget = nambertarget;
    }

    public String getDayT() {
        return dayT;
    }

    public void setDayT(String dayT) {
        this.dayT = dayT;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
}
