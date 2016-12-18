package org.esalenko.algorhitms.Percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private int[][] sites;
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
        top = 0;
        bottom = n * n + 1;
    }

    public void open(int row, int col) {
        validate(row, col);
        sites[row - 1][col - 1] = 1;

        if (row == 1)
            uf.union(getIndex(row, col), top);

        if (row == n)
            uf.union(getIndex(row, col), bottom);

        if (col > 1 && isOpen(row, col - 1))
            uf.union(getIndex(row, col), getIndex(row, col - 1));

        if (col < n && isOpen(row, col + 1))
            uf.union(getIndex(row, col), getIndex(row, col + 1));

        if (row > 1 && isOpen(row - 1, col))
            uf.union(getIndex(row, col), getIndex(row - 1, col));

        if (row < n && isOpen(row + 1, col))
            uf.union(getIndex(row, col), getIndex(row + 1, col));

    }

    public boolean isOpen(int row, int col) {
        validate(row, col);
        return sites[row - 1][col - 1] == 1;
    }

    public boolean isFull(int row, int col) {
        validate(row, col);
        return uf.connected(top, getIndex(row, col));
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

