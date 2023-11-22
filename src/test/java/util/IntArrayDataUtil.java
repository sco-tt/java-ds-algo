package util;

public class IntArrayDataUtil {
  public static int[] getLargeUnsortedIntArray() {
    return new int[]{1000, 35, 120, -15, 7, 55, 2001, 1, -22, 100, 34, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  }
  public static int[] getLargeSortedIntArray() {
    return new int[]{-22, -15, 1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10, 34, 35, 55, 100, 120, 1000, 2001};
  }

  public static int[] getSmallUnsortedIntArray() {
    return new int[] {20, 35, -15, 7, 55, 1, -22};
  }
  public static int[] getSmallSortedIntArray() {
    return new int[] {-22, -15, 1, 7, 20, 35, 55};
  }
}
