package sorting;

public class InsertionSort {
  public static void main(String[] args) {
    CommonService sort = new CommonService();
    int arr[] = {3, 91, 1, 35, 87, 22, 10, 7};
    insertionSortFunc(arr);
    sort.printSortedArray(arr);
  }

  private static void insertionSortFunc(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }

      arr[j + 1] = key;
    }
  }
}

/*NOTES - O(n) = n^2. In this approach we start with the 2nd element, and move the left side elements to right
and move the 2nd element to left if left is greater than the right element.
It works worst when the array is sorted in reverse order*/
