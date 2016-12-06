package org.esalenko.stopwatch;

public class StopwatchImpl implements Stopwatch {

    /**
     * There is a Stopwatch implementation for
     * time measurement of algorithms work
     */
    private final long start;

    /**
     * Creation of Stopwatch
     */
    public StopwatchImpl() {
        start = System.currentTimeMillis();
    }

    /**
     ** @return time, passed after creation
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
