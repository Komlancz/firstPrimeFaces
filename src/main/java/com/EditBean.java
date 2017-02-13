package com;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EditBean {
    private String name;
    private String pass;
    public EditBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        System.out.println(pass);
        this.pass = pass;
    }
}
