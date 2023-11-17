package com.scottpinkelman.javadsalgo;


public class BubbleSort {
  private BubbleSort() {
  }

  public static int[] run(int[] intArray) {
    int parition = intArray.length - 1;

    while (parition > 0) {
      doSort(parition, intArray);
      parition--;
    }
    return intArray;
  }

  private static void doSort(int parition, int[] intArray) {
    for (int i = 0; i < parition; i++) {
      if (intArray[i] > intArray[i + 1]) {
        int tempToShiftRight = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1] = tempToShiftRight;
      }
    }
  }
}