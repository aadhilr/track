package com.zone24x7.projects;

public class CommandLineInputReader implements InputReader {

    @Override
    public String read(String... array) throws NullPointerException {
        return array != null ? array.length > 0 ? array[0] : null : null;
    }
}
