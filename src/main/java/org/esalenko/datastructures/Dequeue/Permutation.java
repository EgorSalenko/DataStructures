package org.esalenko.datastructures.Dequeue;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        String in = StdIn.readString();
        if (0 <= k || k <= in.length()) {
            for (int i = 0; i < k; i++) {
                StdOut.printf(String.valueOf(in.charAt(i)));
            }
        }
    }
}
