package sorting;

public class SelectionSort {
  static CommonService commonService = new CommonService();

  public static void main(String[] args) {
    int arr[] = {3, 9, 1, 35, 87, 22, 10};
    int sorted[] = selectionSortFunc(arr);
    commonService.printSortedArray(sorted);
  }


  private static int[] selectionSortFunc(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      int min = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          int var = arr[j];
          arr[j] = arr[min];
          arr[min] = var;
        }
      }
    }

    return arr;
  }
}

/*NOTES - The selection sort algorithm sorts an array by repeatedly finding the minimum element
from unsorted part and putting it at the beginning.
The algorithm maintains two subarrays in a given array.

Time Complexity: O(n2) as there are two nested loops.
Auxiliary Space: O(1)
The good thing about selection sort is it never makes more than O(n) swaps
and can be useful when memory write is a costly operation. */
