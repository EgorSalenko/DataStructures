package org.esalenko.tasks;

public class Increase {

    /**
     * Increase the specified element of the array by 10%.
     * @param array input array
     * @return input array with increased elements by 10%
     */
    public float[] increaseElements(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 1.1f;
        }
        return array;
    }

}
