package com.zone24x7.projects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String userInput = args[0];
        String path = "data/projects.txt";


        //project_list
        ProjectFactory project = new ProjectFactory();
        Project pro = project.getProject(path, userInput);



        System.out.println("Cost is: " + pro.getCost());

    }
}
