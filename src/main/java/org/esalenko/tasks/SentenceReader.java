package org.esalenko.tasks;

public class SentenceReader {

    /**
     * Method read input string while don't meet a '.',
     * then output in result line.
     *
     * @param sentence - input line;
     * @return result sentence.
     */
    public String reader(String sentence) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c != '.') {
                result.append(c);
            } else {
                result.append(c);
                break;
            }

        }

        return result.toString();
    }

}
