package searching;

import java.util.Collections;

public class BinarySearch {
  public static void main(String[] args) {

    int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
    int element = 130;
    int mid;
    int left = 0, right = arr.length - 1;

    while (right > left) {
      mid = (left + right - 1) / 2;
      if (arr[mid] < element) {
        left = mid + 1;

      } else if (arr[mid] == element) {
        System.out.println("Element found at position:" + mid);
        break;
      } else {
        right = mid - 1;
      }
    }
    System.out.println("Element not found");
  }
}

/*Notes - O(log n) The algorithm divides the sorted array into 2 parts and checks for the side the element is present,
looping through it identifies the element */

