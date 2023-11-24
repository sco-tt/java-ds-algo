package com.scottpinkelman.javadsalgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FactorialTest {
  private static Stream<Arguments> factorialProvider() {
    return Stream.of(
        Arguments.of(3, 6),
        Arguments.of(4, 24)
    );
  }

  @ParameterizedTest
  @MethodSource("factorialProvider")
  void testFactorialIterative() {
    int result = Factorial.runIterative(3);
    Assertions.assertEquals(6, result);
  }

  @ParameterizedTest
  @MethodSource("factorialProvider")
  void testFactorialRecursive(int n, int expectedFactorial) {
    int result = Factorial.runRecursive(n);
    Assertions.assertEquals(expectedFactorial, result);
  }


}
