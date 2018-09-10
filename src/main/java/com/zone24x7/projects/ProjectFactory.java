package com.zone24x7.projects;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProjectFactory {

    String cost;
    Integer num = 0;
    Integer duration = 0;

    Project getProject(String path, String user_input_company) {


        List<String> projects = new ArrayList<String>();
        String[] projectProperties = null;


        try {
            projects = Files.readAllLines(Paths.get(path));
            for (String project : projects) {
                projectProperties = project.split(",");
                String projectId = projectProperties[0];
                String projectType = projectProperties[1];
                num = Integer.parseInt(projectProperties[4]);

                cost = projectProperties[3];
                duration = Integer.parseInt(projectProperties[5]);


                if (user_input_company != null) {
                    if (projectId.equals(user_input_company)) {
                        Project p = createProject(projectType, cost);
                        p.setNumber_of_emp(num);
                        p.setDuration(duration);
                        return p;
                    }
                }
            }
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;

    }


    Project createProject(String type, String cost) {

        if (type.equals("variable")) {
            return new VariableProject();
        } else if (type.equals("fixed")) {
            FixedProject fp = new FixedProject();
            fp.setCost(Integer.parseInt(cost));
            return fp;

        }
        return null;

    }


}
