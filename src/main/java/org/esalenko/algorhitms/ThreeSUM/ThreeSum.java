package org.esalenko.algorhitms.ThreeSUM;

import java.util.Arrays;

public class ThreeSum {
    /**
     * Three Sum algorithm which work with complexity O(n^2)
     * @param array
     */
    public static void threesum(int[] array) {
        Arrays.sort(array);
        int N = array.length;
        int a;
        int b;
        int c;
        int start;
        int end;
        for (int i = 0; i < N - 3; i++) {
            a = array[i];
            start = i + 1;
            end = N - 1;

            while (start < end) {
                b = array[start];
                c = array[end];

                if (a + b + c == 0) {
                    System.out.println(a + " " + b + " " + c);
                    end -= 1;
                } else if (a + b + c > 0) {
                    end -= 1;
                } else {
                    start += 1;
                }
            }

        }
    }
}
