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
        IntArrayDataUtil.getUnsortedIntArray()
    );
    assertArrayEquals(IntArrayDataUtil.getSortedIntArray(), result);
  }


  @Test
  public void testSelectionSortMatchesSorted() {
    int[] result = invoke(
        SelectionSort.class.getSimpleName(),
        SelectionSort::run,
        IntArrayDataUtil.getUnsortedIntArray()
    );
    assertArrayEquals(IntArrayDataUtil.getSortedIntArray(), result);
  }
}
