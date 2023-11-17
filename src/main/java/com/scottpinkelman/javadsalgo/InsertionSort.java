package com.scottpinkelman.javadsalgo;

public class InsertionSort {

  private InsertionSort() {
  }

  public static int[] run(int[] intArray) {
    // i is first unsorted index
    for (int i = 1; i < intArray.length; i++) {
      int firstUnsortedValue = intArray[i];
      // j is the first sorted index
      int j;
      for (j = i; j > 0 && intArray[j - 1] > firstUnsortedValue; j--) {
        // shifting sorted values to the right
        intArray[j] = intArray[j - 1];
      }
      // insert the first unsorted value into the correct position
      intArray[j] = firstUnsortedValue;
    }

    return intArray;
  }
}
