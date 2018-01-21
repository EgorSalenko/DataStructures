package org.esalenko.algorhitms.Sort.collinear_points;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class FastCollinearPoints {

    private List<LineSegment> segmentList;
    private static Point[] aux;

    // finds all line segments containing 4 or more points
    public FastCollinearPoints(Point[] points) {
        if (points == null) throw new IllegalArgumentException();
        segmentList = new ArrayList<>();

        // Think of p as the origin.
        for (int i = 0; i < points.length; i++) {
            Point origin = points[i];
            // For each other point q, determine the slope it makes with p.
            List<Point> collinear = new ArrayList<>();
            for (int j = 1; j < points.length; j++) {
                // Sort the points according to the slopes they makes with p.
                mergeSort(points, origin.slopeOrder());
                // FIXME :: Add only one line segment
                if (origin.slopeTo(points[j]) == origin.slopeTo(points[j - 1])) {
                    collinear.add(origin);
                    // Check if any 3 (or more) adjacent points in the sorted order have
                    // equal slopes with respect to p. If so, these points, together with p,
                    // are collinear.
                    if (collinear.size() > 2) {
                        segmentList.add(new LineSegment(Collections.min(collinear), Collections.max(collinear)));
                        collinear.clear();
                    }
                }
            }
        }
    }

    // the number of line segments
    public int numberOfSegments(){
        return segmentList.size();
    }

    private static void mergeSort(Point[] points, Comparator<Point> comparator) {
        int N = points.length;
        aux = new Point[N];
        for (int n = 1; n < N; n = n+n) {
            for (int i = 0; i < N-n; i += n+n) {
                int lo = i;
                int m  = i+n-1;
                int hi = Math.min(i+n+n-1, N-1);
                merge(points, lo, m, hi, comparator);
            }
        }
    }

    // the line segments
    public LineSegment[] segments(){
        return segmentList.toArray(new LineSegment[segmentList.size()]);
    }

    private static void merge(Point[] array, int lo, int mid, int hi, Comparator<Point> comparator){
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = array[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > hi) {
                array[k] = aux[i++];
            } else if (less(comparator ,aux[i], aux[j])) {
                array[k] = aux[j++];
            } else {
                array[k] = aux[i++];
            }
        }

    }

    // Piece of crap
    private static boolean less( Comparator<Point> comparator,Point aux, Point aux1) {
        return comparator.compare(aux, aux1) < 0;
    }

    public static void main(String[] args) {

        // read the n points from a file
        String path = "C:\\Users\\Richard\\Documents\\princeton algorithms course\\collinear\\";
        String file = "input6.txt";
        In in = new In(path + file);
        int n = in.readInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }

        // draw the points
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point p : points) {
            p.draw();
        }
        StdDraw.show();

        // print and draw the line segments
        FastCollinearPoints collinear = new FastCollinearPoints(points);
        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();
    }
}
