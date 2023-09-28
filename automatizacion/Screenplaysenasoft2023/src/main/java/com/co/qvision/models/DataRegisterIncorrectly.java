package com.co.qvision.models;

public class DataRegisterIncorrectly {
    private String email;
    private String password;
    private String confirmation_password  ;

    public DataRegisterIncorrectly(String email, String password, String confirmation_password) {
        this.email = email;
        this.password = password;
        this.confirmation_password = confirmation_password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmation_password() {
        return confirmation_password;
    }

    public void setConfirmation_password(String confirmation_password) {
        this.confirmation_password = confirmation_password;
    }
}
