package com.zone24x7.projects;

public class VariableProject extends  Project{

    @Override
    public double getCost() {
        return this.getDuration()*this.getNumber_of_emp();
    }

    @Override
    public String toString() {
        return "Var";
    }
}
