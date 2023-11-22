package com.scottpinkelman.javadsalgo;

/**
 * 1. Start at the end of the array and define a sorted and unsorted partition
 *   - sorted partition starts at the end of the array
 * 2. Compare the first two elements in the unsorted partition
 * 3. Swap if the first element is greater than the second element
 * 4. Sorted partition grows by one
 * 5. Continue iterating until the sorted partition is the entire array
 */
public class BubbleSort {
  private BubbleSort() {
  }

  public static int[] run(int[] intArray) {
    int sortedPartitionIndex = intArray.length - 1;

    while (sortedPartitionIndex > 0) {
      doSort(sortedPartitionIndex, intArray);
      sortedPartitionIndex--;
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