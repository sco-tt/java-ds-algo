package com.scottpinkelman.javadsalgo;

import java.time.Instant;
import java.util.function.Function;

public interface TimedTest {
  default int[] invoke(String className, Function<int[], int[]> f, int[] a) {
    Instant start = Instant.now();
    int[] result = f.apply(a);
    Instant end = Instant.now();

    printTime(className, start, end);

    return result;
  }
  default int invoke(String className, Function<Integer, Integer> f, int a) {
    Instant start = Instant.now();
    int result = f.apply(a);
    Instant end = Instant.now();

    printTime(className, start, end);

    return result;
  }

  default void printTime(String className, Instant start, Instant end) {
    System.out.printf("%s ran in %s milliseconds%n",
        className,
        end.compareTo(start) / 1000);
  }
}
