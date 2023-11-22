package com.scottpinkelman.javadsalgo;

/**
 * 1. Divides the array into two partitions: sorted and unsorted
 * 2. Traverses the unsorted partition and finds the largest value
 * 3. Compares the largest value to the elements in the sorted partition
 * 4. Swaps the largest value with the last element in the unsorted partition
 */
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
      // found the largest value index
      int lastIndexValue = intArray[lastUnsortedIndex];
      // swap the largest value with the last element in the unsorted partition
      intArray[lastUnsortedIndex] = intArray[indexOfLargestValue];
      intArray[indexOfLargestValue] = lastIndexValue;
    }

    return intArray;
  }
}
