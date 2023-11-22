package com.scottpinkelman.javadsalgo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import util.IntArrayDataUtil;

import static org.junit.Assert.assertArrayEquals;

@RunWith(MockitoJUnitRunner.class)
public class BasicSortTests implements IntArrayTimedTest {

  @Test
  public void testBubbleSortMatchesSorted() {
    int[] result = invoke(
        BubbleSort.class.getSimpleName(),
        BubbleSort::run,
        IntArrayDataUtil.getLargeUnsortedIntArray()
    );
    assertArrayEquals(IntArrayDataUtil.getLargeSortedIntArray(), result);
  }


  @Test
  public void testSelectionSortMatchesSorted() {
    int[] result = invoke(
        SelectionSort.class.getSimpleName(),
        SelectionSort::run,
        IntArrayDataUtil.getLargeUnsortedIntArray()
    );
    assertArrayEquals(IntArrayDataUtil.getLargeSortedIntArray(), result);
  }
  @Test
  public void testInsertionSortMatchesSorted() {
    int[] result = invoke(
        InsertionSort.class.getSimpleName(),
        InsertionSort::run,
        IntArrayDataUtil.getLargeUnsortedIntArray()
    );
    assertArrayEquals(IntArrayDataUtil.getLargeSortedIntArray(), result);
  }

  @Test
  public void testShellSortMatchesSorted() {
    int[] result = invoke(
        ShellSort.class.getSimpleName(),
        ShellSort::run,
        IntArrayDataUtil.getSmallUnsortedIntArray()
    );
//    assertArrayEquals(IntArrayDataUtil.ge(), result);
  }
}
