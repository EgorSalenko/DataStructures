package org.esalenko.algorhitms.Percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private boolean[][] open;
    private boolean[][] full;
    private WeightedQuickUnionUF uf;
    private int n;

    public Percolation(int n) {
        this.n = n;
        if (n <= 0)
            throw new IllegalArgumentException();

        open = new boolean[n][n];
        uf = new WeightedQuickUnionUF(n * n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                open[i][j] = false;
                full[i][j] = false;
            }
        }
    }

    public void open(int row, int col) {
        validate(row, col);
        if (!isOpen(row, col)) {
            open[row][col] = true;
            full = fill(open);
        }
    }

    public boolean isOpen(int row, int col) {
        return open[row][col];
    }

    public boolean isFull(int row, int col) {
        return full[row][col];
    }

    public boolean percolates() {
        int n = open.length;
        for (int i = 0; i < n; i++) {
            if (full[n - 1][i]) return true;
        }

        return false;
    }

    private void validate(int row, int col) {
        if (row <= 0 || row <= n || col <= 0 || col <= n)
            throw new IndexOutOfBoundsException();
    }

    private boolean[][] fill(boolean[][] open) {
        for (int i = 0; i < open.length; i++) {
            flow(open, full, 0, i);
        }
        return full;
    }

    private void flow(boolean[][] open, boolean[][] full, int row, int col) {
        int n = open.length;

        if (row < 0 || n < row) return;
        if (col < 0 || n < col) return;
        if (isOpen(row, col)) return;
        if (isFull(row, col)) return;

        flow(open, full, row + 1, col); // up
        flow(open, full, row - 1, col); // down
        flow(open, full, row, col + 1); // right
        flow(open, full, row, col - 1); // left
    }


}

