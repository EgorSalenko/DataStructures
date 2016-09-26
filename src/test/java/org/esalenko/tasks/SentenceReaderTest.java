package org.esalenko.tasks;

import static org.junit.Assert.*;


public class SentenceReaderTest {
    @org.junit.Test
    public void reader() throws Exception {
        String input = "Hello! My name is Egor. I am a Java developer.";
        String expected = "Hello! My name is Egor.";
        SentenceReader sentenceReader = new SentenceReader();
        String actual = sentenceReader.reader(input);

        System.out.println(actual);
        assertEquals(actual, expected);
    }

}