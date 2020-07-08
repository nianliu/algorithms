package com.github.nianliu;

public class StopWatch {

    private final long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTimeInSecond() {
        return (System.currentTimeMillis() - start) / 1000.0;
    }

}
