package org.esalenko.algorhitms.Percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

    private double[] results;
    private int trials;
    private double interval = 1.96D;

    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0)
            throw new IllegalArgumentException();

        this.trials = trials;
        results = new double[trials];

        for (int i = 0; i < trials; i++) {
            Percolation percolation = new Percolation(n);
            int opened = 0;
            while (!percolation.percolates()) {
                int row = StdRandom.uniform(1, n + 1);
                int col = StdRandom.uniform(1, n + 1);
                if (!percolation.isOpen(row, col)) {
                    percolation.open(row, col);
                    opened++;
                }
            }
            results[i] = opened / (double) (n * n);
        }
    }


    public double mean() {
        return StdStats.mean(results);
    }

    public double stddev() {
        return StdStats.stddev(results);
    }

    public double confidenceLo() {
        return mean() - (interval * stddev() / Math.sqrt(trials));
    }

    public double confidenceHi() {
        return mean() + (interval * stddev() / Math.sqrt(trials));
    }

    public static void main(String[] args) {
        PercolationStats stats = new PercolationStats(2, 10000);
        System.out.println("mean = " + stats.mean());
        System.out.println("std deviation = " + stats.stddev());
        System.out.println("95% confidence interval = " + stats.confidenceLo() + ", " + stats.confidenceHi());
    }
}
