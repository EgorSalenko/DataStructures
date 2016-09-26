package org.esalenko.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class CensureTest {
    @Test
    public void cutCensured() throws Exception {

        Censure censure = new Censure();

        String input = "Some shit, and again we have some shit. I expect this shit was changed.";
        String expected = "Some CENSURE, and again we have some CENSURE. I expect this CENSURE was changed.";
        String actual = censure.cutCensured(input);
        System.out.println(actual);

        assertEquals(expected, actual);
    }

}