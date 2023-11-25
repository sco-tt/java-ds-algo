package com.scottpinkelman.javadsalgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FactorialTest implements TimedTest {
  private static Stream<Arguments> factorialProvider() {
    return Stream.of(
        Arguments.of(3, 6),
        Arguments.of(4, 24)
    );
  }

  @ParameterizedTest
  @MethodSource("factorialProvider")
  void testFactorialIterative(int n, int expectedFactorial) {
    int result = invoke(
        String.format("%s, (%s)", Factorial.class.getSimpleName(), "iterative"),
        Factorial::runIterative,
        n
    );
    Assertions.assertEquals(expectedFactorial, result);
  }

  @ParameterizedTest
  @MethodSource("factorialProvider")
  void testFactorialRecursive(int n, int expectedFactorial) {
    int result = invoke(
        String.format("%s, (%s)", Factorial.class.getSimpleName(), "recursive"),
        Factorial::runIterative,
        n
    );
    Assertions.assertEquals(expectedFactorial, result);
  }
}
