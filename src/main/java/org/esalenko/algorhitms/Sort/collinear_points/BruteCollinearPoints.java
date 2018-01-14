package org.esalenko.algorhitms.Sort.collinear_points;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BruteCollinearPoints {

    private List<LineSegment> lineSegments;

    // finds all line segments containing 4 points
    public BruteCollinearPoints(Point[] points) {
        if (points == null) throw new IllegalArgumentException();

        Arrays.sort(points);
        int n = points.length;
        lineSegments = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Point p = points[i];
            for (int j = i + 1; j < n; j++) {
                Point q = points[j];
                for (int k = j + 1; k < n; k++) {
                    Point r = points[k];
                    for (int l = k + 1; l < n; l++) {
                        Point s = points[l];

                        if (p.slopeTo(q) == q.slopeTo(r)
                                && q.slopeTo(r) == r.slopeTo(s)) {
                            lineSegments.add(new LineSegment(p, s));
                        }

                    }
                }
            }
        }
    }

    // the number of line segments
    public int numberOfSegments() {
        return lineSegments.size();
    }

    // the line segments
    public LineSegment[] segments() {
        return lineSegments.toArray(new LineSegment[numberOfSegments()]);
    }

}
