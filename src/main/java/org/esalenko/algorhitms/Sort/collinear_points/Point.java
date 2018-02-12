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
        if (that == null) throw new IllegalArgumentException();

        if (this.x == that.x) {
            if (this.y == that.y){
                return Double.NEGATIVE_INFINITY;
            } else {
                return Double.POSITIVE_INFINITY;
            }
        }
        if (this.y == that.y) {
            return 0.0d;
        }
        return (double) (that.y - this.y) / (double) (that.x - this.x);
    }

    // compare two points by slopes they make with this point
    public Comparator<Point> slopeOrder() {
        return new SlopeOrder();
    }

    private class SlopeOrder implements Comparator<Point> {

        @Override
        public int compare(Point q1, Point q2) {

           double slopeQ1 = slopeTo(q1);
           double slopeQ2 = slopeTo(q2);

           if (slopeQ1 < slopeQ2) {
               return 1;
           } else if (slopeQ1 > slopeQ2) {
               return -1;
           } else {
               return 0;
           }
        }
    }

}
