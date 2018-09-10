package com.zone24x7.projects;

public class FixedProject extends Project {

    private Integer cost;

    public void setCost(Integer cost) {
        this.cost = cost;
    }


    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Fixed";
    }
}
