package com.zone24x7.projects;

public class CommandLineTrackViewer implements TrackViewer {
    @Override
    public void viewTrack(double cost) {
        System.out.println("Cost is :" + cost);
    }

    @Override
    public void viewError(String message) {
        System.out.println(message);
    }
}
