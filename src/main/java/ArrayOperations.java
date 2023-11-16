import java.util.*;

public class ArrayOperations {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
    int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

    int[] commonElements = findCommonElements(array1, array2);
    System.out.print("Common elements: ");
    for (int element : commonElements) {
      System.out.print(element + " ");
    }

    int[] array3 = {-1, 4, 0, 2, 7, -3};
    int secondLargest = findSecondLargest(array3);
    System.out.println("Second largest element in array3: " + secondLargest);

    int secondSmallest = findSecondSmallest(array3);
    System.out.println("Second smallest element in array3: " + secondSmallest);

    int[] uniqueElementsArray1 = removeDuplicates(array1);
    System.out.println("Unique elements in array1: ");
    for (int element : uniqueElementsArray1) {
      System.out.print(element + " ");
    }
  }

  public static int[] findCommonElements(int[] array1, int[] array2) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> resultSet = new HashSet<>();

    for (int num : array1) {
      set.add(num);
    }

    for (int b : array2) {
      if (set.contains(b)) {
        resultSet.add(b);
      }
    }

    int[] result = new int[resultSet.size()];
    int index = 0;
    for (int num : resultSet) {
      result[index++] = num;
    }

    return result;
  }


  public static int[] removeDuplicates(int[] inputArray) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int num : inputArray) {
      set.add(num);
    }

    int[] result = new int[set.size()];
    int index = 0;
    for (int num : set) {
      result[index++] = num;
    }

    return result;
  }


  public static int findSecondLargest(int[] inputArray) {
    Arrays.sort(inputArray);
    int n = inputArray.length;

    int max = inputArray[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      if (inputArray[i] < max) {
        return inputArray[i];
      }
    }

    return -1;
  }

  public static int findSecondSmallest(int[] inputArray) {
    Arrays.sort(inputArray);
    int n = inputArray.length;

    int min = inputArray[0];
    for (int i = 1; i < n; i++) {
      if (inputArray[i] > min) {
        return inputArray[i];
      }
    }

    return -1;
  }
}
