package searching;

public class BinarySearchRecursive {
  public static void main(String[] args) {
    int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
    int element = 130;
    System.out.println(
        "Element found at: " + (recursiveBinarySearch(0, arr.length - 1, element, arr) + 1));
  }

  private static int recursiveBinarySearch(int left, int right, int element, int[] arr) {
    while (right >= left) {
      int mid = (left + right - 1) / 2;
      if (arr[mid] == element) {
        return mid;
      } else if (element < arr[mid]) {
        return recursiveBinarySearch(left, mid - 1, element, arr);
      } else {
        return recursiveBinarySearch(mid + 1, right, element, arr);
      }
    }
    return -1;
  }
}

/*Notes - O(log n) Recursive function checks by dividing the array into 2 parts,
and calls the same function by changing mid to left or right position */


