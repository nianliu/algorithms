package com.github.nianliu;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Not efficient way of finding the triples where the sum of three numbers is 0.
 * Complexity = N^3
 */
public class ThreeSum {

    public static void main(String[] args) {
        int size = 4000;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt();
        }

        StopWatch stopWatch = new StopWatch();
        int count = threeSum(numbers);
        System.out.println(String.format("Found %s triples, took %s seconds", count, stopWatch.elapsedTimeInSecond()));
    }

    public static int threeSum(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        System.out.println(String.format("Found (%s, %s, %s)", numbers[i], numbers[j], numbers[k]));
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
