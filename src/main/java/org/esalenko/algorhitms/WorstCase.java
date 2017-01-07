package org.esalenko.algorhitms;

public class WorstCase {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int eggDrop(int eggs, int floors) {
        int drops[][] = new int[eggs + 1][floors + 1];
        int res;

        for (int i = 1; i <= eggs; i++) {
            drops[i][1] = 1;
            drops[i][0] = 0;
        }

        for (int j = 1; j <= floors; j++)
            drops[1][j] = j;

        for (int i = 2; i <= eggs; i++) {
            for (int j = 2; j <= floors; j++) {
                drops[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    res = 1 + max(drops[i - 1][x - 1], drops[i][j - x]);
                    if (res < drops[i][j])
                        drops[i][j] = res;
                }
            }
        }

        return drops[eggs][floors];
    }
}