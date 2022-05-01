package sorting;

public class BubbleSort {

  static CommonService sort = new CommonService();

  public static void main(String[] args) {
    int arr[] = {3, 9, 1, 35, 87, 22, 10};
    int sorted[] = bubbleSort(arr);
    sort.printSortedArray(sorted);

    int newArr[] = {1,2,3,4,6};
    int newSorted[] = improvedBubbleSort(newArr);
    sort.printSortedArray(newSorted);
  }

  private static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  private static int[] improvedBubbleSort(int[] arr) {

    /*The above function always runs O(n^2) time even if the array is sorted.
    It can be optimized by stopping the algorithm if the inner loop didn’t cause any swap. */

    boolean swapped = false;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
          swapped = true;
        }
      }
      if(swapped == false)
        break;
    }
    return arr;
  }
}

/*NOTES - The bubble sort algorithm sorts an array by repeatedly swapping 2 consecutive elements and finding the minimum elemen
Time Complexity: O(n2) as there are two nested loops.
Auxiliary Space: O(1)
The good thing about selection sort is it never makes more than O(n) swaps
and can be useful when memory write is a costly operation. */
