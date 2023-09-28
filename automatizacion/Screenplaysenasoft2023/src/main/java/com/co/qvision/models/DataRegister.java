package com.co.qvision.models;

public class DataRegister {
// creamos variables para almacenar nuestra data que damos en el feature
    private String email;
    private String password;
    private String confirmation_password  ;

    //constructor para poder instaciar estas variables a nuestra clase Tasks y en los step
    public DataRegister(String email, String password, String confirmation_password) {
        this.email = email;
        this.password = password;
        this.confirmation_password = confirmation_password;
    }
// metodos para poder obtener esta informacion wn nuestra clase task
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
