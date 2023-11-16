import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {


  @Test
  public void testFindCommonElementsWithCommonElementsPresent() {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {3, 4, 5, 6, 7};

    int[] expected = {3, 4, 5};
    int[] actual = ArrayOperations.findCommonElements(array1, array2);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void testFindCommonElementsWithNoCommonElements() {
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};

    int[] expected = {};
    int[] actual = ArrayOperations.findCommonElements(array1, array2);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void testFindCommonElementsWithSameElementsInDifferentOrder() {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {5, 4, 3, 2, 1};

    int[] expected = {1, 2, 3, 4, 5};
    int[] actual = ArrayOperations.findCommonElements(array1, array2);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void checkIfReturnedArrayIsNotNull() {
    int[] array1 = {1, 2, 3};
    int[] array2 = {2, 3, 4};

    int[] result = ArrayOperations.findCommonElements(array1, array2);
    assertNotNull(result);
  }

  @Test
  public void testRemoveDuplicatesWithDuplicateElements() {
    int[] array = {1, 2, 3, 2, 4, 5, 3};
    int[] expected = {1, 2, 3, 4, 5};
    int[] result = ArrayOperations.removeDuplicates(array);

    assertArrayEquals(expected, result);
  }

  @Test
  public void testRemoveDuplicatesWithoutDuplicateElements() {
    int[] array = {1, 2, 3, 4, 5};
    int[] result = ArrayOperations.removeDuplicates(array);

    assertArrayEquals(array, result);
  }

  @Test
  public void testRemoveDuplicatesFromEmptyArray() {
    int[] array = {};
    int[] result = ArrayOperations.removeDuplicates(array);

    assertEquals(0, result.length);
  }

  @Test
  public void testRemoveDuplicatesPreserveOrder() {
    int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
    int[] expected = {1, 2, 3, 4, 5};
    int[] result = ArrayOperations.removeDuplicates(array);

    assertArrayEquals(expected, result);
  }

  @Test
  public void testFindSecondSmallestWithPositiveNumbers() {
    int[] array = {5, 2, 8, 1, 6};
    int expected = 2;
    int result = ArrayOperations.findSecondSmallest(array);

    assertEquals(expected, result);
  }


  @Test
  public void testFindSecondSmallestWithDuplicateElements() {
    int[] array = {5, 2, 2, 8, 1, 6};
    int expected = 2;
    int result = ArrayOperations.findSecondSmallest(array);

    assertEquals(expected, result);
  }


  @Test
  public void testFindSecondSmallestWithSingleElement() {
    int[] array = {5};
    int expected = -1;
    int result = ArrayOperations.findSecondSmallest(array);

    assertEquals(expected, result);
  }

  @Test
  public void testFindSecondLargestWithPositiveNumbers() {
    int[] array = {5, 2, 8, 1, 6};
    int expected = 6;
    int result = ArrayOperations.findSecondLargest(array);

    assertEquals(expected, result);
  }

  @Test
  public void testFindSecondLargestWithNegativeNumbers() {
    int[] array = {-5, -2, -8, -1, -6};
    int expected = -2;
    int result = ArrayOperations.findSecondLargest(array);

    assertEquals(expected, result);
  }

  @Test
  public void testFindSecondLargestWithDuplicateElements() {
    int[] array = {5, 2, 2, 8, 1, 6};
    int expected = 6;
    int result = ArrayOperations.findSecondLargest(array);

    assertEquals(expected, result);
  }

  @Test
  public void testFindSecondLargestWithZeroAndPositiveNumbers() {
    int[] array = {0, 2, 8, 1, 6};
    int expected = 6;
    int result = ArrayOperations.findSecondLargest(array);

    assertEquals(expected, result);
  }

  @Test
  public void testFindSecondLargestWithSingleElement() {
    int[] array = {5};
    int expected = -1;
    int result = ArrayOperations.findSecondLargest(array);

    assertEquals(expected, result);
  }
}
