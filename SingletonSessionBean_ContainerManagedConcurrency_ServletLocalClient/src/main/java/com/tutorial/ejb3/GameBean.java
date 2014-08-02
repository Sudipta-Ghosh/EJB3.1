package com.tutorial.ejb3;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;


import java.util.ArrayList;
import javax.ejb.LocalBean;

@Singleton
@LocalBean
@Startup
@DependsOn("PlayerBean")
public class GameBean {
    private ArrayList elements;
    private String state;

   @PostConstruct
   private void initialize() {
       // Use player files
       state = "Initilizing";
       elements = new ArrayList();
       System.out.println("GameBean initialized");
   }

    public ArrayList getElements() {
        return elements;
    }

    public void setElements(ArrayList elements) {
        this.elements = elements;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
