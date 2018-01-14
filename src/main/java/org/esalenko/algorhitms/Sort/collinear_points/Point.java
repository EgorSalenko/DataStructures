package org.esalenko.algorhitms.Sort.collinear_points;


import java.util.Comparator;

import edu.princeton.cs.algs4.StdDraw;

public class Point implements Comparable<Point> {

    private int x;
    private int y;

    // constructs the point (x, y)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // draws this point
    public void draw() {
        StdDraw.point(this.x, this.y);
    }

    // draws the line segment from this point to that point
    public void drawTo(Point that) {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // string representation
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // compare two points by y-coordinates, breaking ties by x-coordinates
    public int compareTo(Point that) {
        if (that == null) throw new IllegalArgumentException();

        if (that.y < this.y) {
            return 1;
        } else if (that.y > this.y) {
            return -1;
        } else if (that.x < this.x) {
            return 1;
        } else if (that.x > this.x) {
            return -1;
        } else {
            return 0;
        }
    }

    // the slope between this point and that point
    public double slopeTo(Point that) {
        return ((double) that.y - (double) this.y) / ((double) that.x - (double) this.x);
    }

    // compare two points by slopes they make with this point
    public Comparator<Point> slopeOrder() {
        return (p1, p2) -> {
            if (p1.slopeTo(p2) < p2.slopeTo(p1)) {
                return 1;
            } else if (p1.slopeTo(p2) > p2.slopeTo(p1)) {
                return -1;
            } else {
                return 0;
            }
        };
    }

}
