package org.esalenko.tasks;

public class Censure {
    /**
     * Replace forbidden word on - CENSURE
     * @param input
     * @return
     */
    public String cutCensured(String input) {

        String forbidden = "shit";
        String censure = "CENSURE";
        String result = input;

        if (input.contains(forbidden)) {
            result = input.replace(forbidden, censure);
        }

        return result;
    }
}
