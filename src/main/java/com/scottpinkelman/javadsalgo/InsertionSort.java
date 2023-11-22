package com.scottpinkelman.javadsalgo;

public class InsertionSort {

  private InsertionSort() {
  }

  public static int[] run(int[] intArray) {
    // i=1 is the first unsorted index
    // i = 0 is assumed to be sorted
    for (int i = 1; i < intArray.length; i++) {
      // store the value of the first unsorted index
      int firstUnsortedValue = intArray[i];
      // j is the first sorted index
      int j;
      // iterate through the unsorted partition; for each value if it's greater than the first unsorted value
      // shift the sorted values to the right
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
