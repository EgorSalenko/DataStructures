package org.esalenko.algorhitms.Percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private int[][] sites; // 0 - blocked, 1 - open
    private WeightedQuickUnionUF uf;
    private int top;
    private int bottom;
    private int n;

    public Percolation(int n) {
        this.n = n;
        if (n <= 0)
            throw new IllegalArgumentException();

        uf = new WeightedQuickUnionUF(n * n + 2);
        sites = new int[n][n];
        top = sites[0][0];
        bottom = sites[n - 1][n - 1];
    }

    public void open(int row, int col) {
        validate(row, col);
        if (!isOpen(row, col)) {
            sites[row - 1][col - 1] = 1;

        }
    }

    public boolean isOpen(int row, int col) {
        validate(row, col);
        return sites[row - 1][col - 1] == 1;
    }

    public boolean isFull(int row, int col) {
        validate(row, col);
        return uf.connected(top, sites[row - 1][col - 1]);
    }

    public boolean percolates() {
        return uf.connected(top, bottom);
    }

    private void validate(int row, int col) {
        if (row < 0 || row > n || col < 0 || col > n)
            throw new IndexOutOfBoundsException();
    }

    private int getIndex(int row, int col) {
        return n * (row - 1) + col;
    }

}

