package org.esalenko.designpatterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "This is logfile. \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addLogFile(String logInfo) {
        logfile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logfile);
    }
}
