package org.esalenko.algorhitms.Sort.shellsort;

public class ShellSort {

    public static void sort(int[] array) {
        int N = array.length;
        int increment = N / 2;
        System.out.println("initial increment size : " + increment);
        printArray(array);
        System.out.println();
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(array, startIndex, increment);
            }
            printArray(array);
            increment /= 2;
            System.out.println("changed increment size : " + increment);
        }
    }

    private static void insertionSort(int[] array, int startIndex, int h) {
        for (int i = startIndex; i < array.length; i += h) {
            for (int j = Math.min(i + h, array.length - 1); j - h >= 0; j -= h) {
                if (array[j - h] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                } else {
                    break;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] srcArray = new int[]{
                32, 95, 16, 82, 24, 66, 35, 19, 75, 54, 40, 43, 93, 68
        };
        sort(srcArray);
    }

}
