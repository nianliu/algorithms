package com.github.nianliu.utils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class In {

    public static int[] readInts(String path) {
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            return lines.mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
