package org.esalenko.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wrong on 26.09.16.
 */
public class HumanWeightOnTheMoonTest {

    private static final float DELTA = 0.0002f;

    @Test
    public void calculate() throws Exception {
        HumanWeightOnTheMoon onTheMoon = new HumanWeightOnTheMoon();

        float normalWeight = 75;
        float expectedWeightOnMoon = 121.65f;
        float actualWeightOnMoon = onTheMoon.calculate(normalWeight);

        assertEquals(expectedWeightOnMoon, actualWeightOnMoon, DELTA);
    }

}