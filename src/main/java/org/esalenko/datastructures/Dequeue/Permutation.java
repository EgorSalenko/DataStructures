package org.esalenko.datastructures.Dequeue;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        String s = StdIn.readString();
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<>();
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                String str = "";
                str.concat(String.valueOf(s.charAt(i)));
                if (s.charAt(i) == ' ') {
                    randomizedQueue.enqueue(str);
                }
            }
            for (int i = 0; i < k; i++) {
                StdOut.println(randomizedQueue.sample());
            }
        }
    }
}
