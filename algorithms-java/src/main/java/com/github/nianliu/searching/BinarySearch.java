package com.github.nianliu.searching;

import com.github.nianliu.utils.In;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static final String FILE = "/Users/nliu/workspace/learning/algorithms/test_data/tinyT.txt";

    public static void main(String[] args) {
        int[] ints = In.readInts(FILE);
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            int target = Integer.parseInt(line);
            System.out.println(String.format("Searching for %s...", target));

            Arrays.sort(ints);

            int position = search(ints, target);
            if (position == -1) {
                System.out.println(String.format("Cannot find %s", target));
            } else {
                System.out.println(String.format("Found %s at %s", target, position));
            }

            line = scanner.nextLine();
        }
    }

    private static int search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                high = mid - 1;
            }

            if (array[mid] < target) {
                low = mid + 1;
            }
        }

        return -1;
    }
}
