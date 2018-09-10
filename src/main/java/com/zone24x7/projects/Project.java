package com.zone24x7.projects;

public abstract class Project {
    private Integer company_id;
    private String company_name;
    private  Integer number_of_emp;
    private  Integer duration;

    public abstract Integer getCost();

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getNumber_of_emp() {
        return number_of_emp;
    }

    public void setNumber_of_emp(Integer number_of_emp) {
        this.number_of_emp = number_of_emp;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }





}
