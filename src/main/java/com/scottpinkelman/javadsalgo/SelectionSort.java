package com.scottpinkelman.javadsalgo;

public class SelectionSort {

  private SelectionSort() {
  }

  public static int[] run(int[] intArray) {
    for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
      int indexOfLargestValue = lastUnsortedIndex;
      for (int j = 0; j <= lastUnsortedIndex; j++) {
        if (intArray[j] > intArray[indexOfLargestValue]) {
          indexOfLargestValue = j;
        }
      }
      int lastIndexValue = intArray[lastUnsortedIndex];
      intArray[lastUnsortedIndex] = intArray[indexOfLargestValue];
      intArray[indexOfLargestValue] = lastIndexValue;
    }

    return intArray;
  }
}
