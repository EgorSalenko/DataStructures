package org.esalenko.datastructures.Dequeue;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        String in = StdIn.readString();

        for (int i = 0; i <= k; i++) {
            System.out.println(in.charAt(StdRandom.uniform(0, in.length())));
        }

    }
}
