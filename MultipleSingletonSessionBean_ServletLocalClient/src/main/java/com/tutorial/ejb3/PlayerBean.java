package com.tutorial.ejb3;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

@Singleton
@LocalBean
public class PlayerBean {
    private String name;

    @PostConstruct
    private void initialize() {
        this.name = "Ultimate Software Warrior";
        // Initialize player files
        System.out.println("PlayerBean initialized " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
