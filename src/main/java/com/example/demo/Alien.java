package com.example.demo;

public class Alien {
    
    String aname;
    String alanguage;
    int aid;
    
    public Alien() {
        System.out.println("in the alien constructor!");
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAlanguage() {
        return alanguage;
    }

    public void setAlanguage(String alanguage) {
        this.alanguage = alanguage;
    }
}
