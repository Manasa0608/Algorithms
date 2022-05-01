package sorting;

public class RecursiveBubbleSort {
  static CommonService sort = new CommonService();

  public static void main(String[] args) {
    int arr[] = {3, 91, 1, 35, 87, 22, 10, 7};
    recursiveBubbleSort(arr, arr.length);
    sort.printSortedArray(arr);
  }

  private static void recursiveBubbleSort(int[] arr, int length) {
    if (length == 1) return;

    for (int i = 0; i < length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    recursiveBubbleSort(arr, length - 1);
  }
}
