package com.scottpinkelman.javadsalgo;

public class Factorial {
  private Factorial() {
  }

  public static int runIterative(int n) {
    int result = 1;
    if (n == 0) {
      return result;
    }
    for (int i = 1; i <= n; i++) {
      result *= i;
    }

    return result;
  }

  public static int runRecursive(int n) {
    if (n == 0) {
      return 1;
    }
    return n * runRecursive(n - 1);
  }
}

