package org.esalenko.algorhitms.BitonicSearch;

public class BitonicSearch {

    // [ 10, 12, 14, 15, 9, 6, 3, -1 ]

    public int bitonic(int[] array, int key, int low, int high) {
        int middle = low + high / 2;
        if (key < high) {
            while (low <= middle) {
                int midLow = low + (middle - low) / 2;
                if (key < array[midLow])
                    middle -= 1;
                else if (key > array[midLow])
                    middle += 1;
                else
                    return midLow;
            }
        } else if (key > high) {
            while (middle <= high) {
                int midHigh = middle + (high - middle) / 2;
                if (key < array[midHigh])
                    high -= 1;
                else if (key > array[midHigh])
                    high += 1;
                else
                    return midHigh;
            }
        }
        return -1;
    }
}
