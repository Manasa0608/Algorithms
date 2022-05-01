package searching;

import java.util.Arrays;

public class ExponentialSearch {
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 50, 60, 80, 100, 120, 130, 170};
    int element = 130;

    System.out.println("Element found at position: " + exponentialSearchFunc(arr, element));
  }

  public static int exponentialSearchFunc(int[] arr, int element) {

    if (arr[0] == element) {
      return 0;
    }
    int i = 1;

    while (i < arr.length && arr[i] <= element) {
      i *= 2;
    }

    // Call binary search for the found range.
    return Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length - 1), element);
  }
}

/*NOTES - Important points:
Time Complexity : O(Log n)
Works only sorted arrays.
Exponential Binary Search is particularly useful for unbounded searches,
where size of array is infinite.
Please refer Unbounded Binary Search for an example.
It works better than Binary Search for bounded arrays,
and also when the element to be searched is closer to the first element.*/
