package org.esalenko.algorhitms.BinarySearch;

public class BinarySearch {

    public static int rank(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < array[middle])
                high = middle - 1;
            else if (key > array[middle])
                low = middle + 1;
            else
                return middle;
        }
        return -1;
    }
}
