package org.esalenko.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncreaseTest {

    @Test
    public void upOnTenPercent() throws Exception {

        Increase increase = new Increase();

        float[] input = new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        float[] expected = new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f};
        float[] actual = increase.increaseElements(input);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(actual[i], expected[i], 0.002);
        }
    }

}