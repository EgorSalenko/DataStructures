package org.esalenko.designpatterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogFile("First LOG");
        ProgramLogger.getProgramLogger().addLogFile("Second LOG");
        ProgramLogger.getProgramLogger().addLogFile("Third LOG");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
