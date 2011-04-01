package com.far.scape;

import com.far.scape.scala.Cast;

public class Kadargo implements Cast {

    private String name;

    public String getName() {
        return name;
    }

    public void save(){
        System.out.println("in java save");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String race() {
        return "I am Luxan";
    }

    public String actor() {
        return "Anthony Simcoe";
    }
}
