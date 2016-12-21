package org.esalenko.algorhitms.Percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private boolean[][] sites;
    private WeightedQuickUnionUF uf;
    private WeightedQuickUnionUF ufTop;
    private int top;
    private int bottom;
    private int n;

    public Percolation(int n) {
        this.n = n;
        if (n <= 0)
            throw new IllegalArgumentException();

        uf = new WeightedQuickUnionUF(n * n + 2);
        ufTop = new WeightedQuickUnionUF(n * n + 1);
        sites = new boolean[n][n];
        top = 0;
        bottom = n * n + 1;
    }

    public void open(int row, int col) {
        if (row < 0 || row > n || col < 0 || col > n)
            throw new IndexOutOfBoundsException();

        sites[row - 1][col - 1] = true;

        int current = getIndex(row, col);
        int bottomSide = getIndex(row + 1, col);
        int topSide = getIndex(row - 1, col);
        int rightSide = getIndex(row, col + 1);
        int leftSide = getIndex(row, col - 1);

        if (row == 1) {
            uf.union(current, top);
            ufTop.union(current, top);
        }

        if (row == n)
            uf.union(current, bottom);


        if (col > 1 && isOpen(row, col - 1)) {
            uf.union(current, leftSide);
            ufTop.union(current, leftSide);
        }

        if (col < n && isOpen(row, col + 1)) {
            uf.union(current, rightSide);
            ufTop.union(current, rightSide);
        }

        if (row > 1 && isOpen(row - 1, col)) {
            uf.union(current, topSide);
            ufTop.union(current, topSide);
        }

        if (row < n && isOpen(row + 1, col)) {
            uf.union(current, bottomSide);
            ufTop.union(current, bottomSide);
        }

    }

    public boolean isOpen(int row, int col) {
        if (row < 0 || row > n || col < 0 || col > n)
            throw new IndexOutOfBoundsException();

        return sites[row - 1][col - 1];
    }

    public boolean isFull(int row, int col) {
        if (row < 0 || row > n || col < 0 || col > n)
            throw new IndexOutOfBoundsException();

        int current = getIndex(row, col);
        return uf.connected(top, current) && ufTop.connected(top, current);
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

