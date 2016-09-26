package org.esalenko.tasks;

public class HumanWeightOnTheMoon {

    /**
     * Calculate human weight on the Moon
     * @param weight on Earth
     * @return weight on the Moon
     */
    public float calculate(float weight) {

        float gravitationalAcceleration = 1.622f;

        return weight * gravitationalAcceleration;
    }

}
