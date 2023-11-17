package com.scottpinkelman.javadsalgo;

import java.time.Instant;
import java.util.function.Function;

public interface IntArrayTimedTest {
  default int[] invoke(String className, Function<int[], int[]> f, int[] a) {
    Instant start = Instant.now();
    int[] result = f.apply(a);
    Instant end = Instant.now();


    System.out.printf("%s ran in %s milliseconds%n",
        className,
        end.compareTo(start) / 1000);

    return result;
  }

}
