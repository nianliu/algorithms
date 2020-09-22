package com.github.nianliu.searching;

import com.github.nianliu.utils.In;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("source")
    public void test(int toSearch, int position) {
        int[] array = {0, 2, 4};
        assertEquals(position, new BinarySearch().search(array, toSearch));
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.arguments(0, 0),
                Arguments.arguments(1, -1),
                Arguments.arguments(2, 1)
        );
    }

    @Test
    @Disabled
    public void play() {
        final String FILE = "/Users/nliu/workspace/learning/algorithms/test_data/tinyT.txt";
        int[] ints = In.readInts(FILE);
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            int target = Integer.parseInt(line);
            System.out.println(String.format("Searching for %s...", target));

            Arrays.sort(ints);

            int position = BinarySearch.search(ints, target);
            if (position == -1) {
                System.out.println(String.format("Cannot find %s", target));
            } else {
                System.out.println(String.format("Found %s at %s", target, position));
            }

            line = scanner.nextLine();
        }
    }

}