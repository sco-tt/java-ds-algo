package com.scottpinkelman.javadsalgo;

import java.util.Arrays;

/**
 * Variation of {@link InsertionSort}. Instead of comparing adjacent elements, the shell sort compares
 * elements farther apart from each other. It keeps reducing the gap between elements until it's 1
 * at which point it's a regular insertion sort.
 * Knuth's sequence: 3^k - 1
 * Based our gap on the array length: gap = array.length / 2
 */
public class ShellSort {
  private ShellSort() {

  }

  public static int[] run(int[] intArray) {
    for (int gap = intArray.length / 2; gap > 0; gap = gap / 2) {
      for (int i = gap; i < intArray.length; i++) {

        int newElement = intArray[i];
        int j = i;
        while (j >= gap && intArray[j - gap] > newElement) {
          intArray[j] = intArray[j - gap];
          j -= gap;
        }

        intArray[j] = newElement;
      }
    }
    return intArray;
  }
}
