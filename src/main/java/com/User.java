package com;

public class User {
    private String name;
    private String pass;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name: "+name);
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        System.out.println("pass: "+pass);
        this.pass = pass;
    }
    public void saveUser(){
        System.out.println("User saved: "+name+" "+pass);
    }
}
