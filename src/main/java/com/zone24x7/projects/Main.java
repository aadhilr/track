package com.zone24x7.projects;

public class Main {
    private static InputReader inputReader;
    private static String userinput;
    private final static String PATH = "data/projects.txt";
    private static Project project;
    private static TrackViewer trackViewer;

    static {
        inputReader = new CommandLineInputReader();
        trackViewer = new CommandLineTrackViewer();
    }
    public static void main(String[] args) {

        try {
            userinput = inputReader.read(args);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        if(userinput != null){
            //project_list
            ProjectFactory pro = new ProjectFactory();
            project = pro.getProject(PATH, userinput);
            if (project != null) {
                trackViewer.viewTrack(project.getCost());
            }else {
                trackViewer.viewError("Please re-check your Inputs..");
            }
        }

    }
}
