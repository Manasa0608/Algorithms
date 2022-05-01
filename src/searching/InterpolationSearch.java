package searching;

public class InterpolationSearch {
  public static void main(String[] args) {
    int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
    int element = 23;

    System.out.println(
        "Element found at position : " + interpolationSearch(arr, 0, arr.length - 1, element));
  }

  public static int interpolationSearch(int arr[], int low, int high, int element) {
    int pos;

    // Since array is sorted, an element
    // present in array must be in range
    // defined by corner
    if (low <= high && element >= arr[low] && element <= arr[high]) {

      // Probing the position with keeping
      // uniform distribution in mind.
      pos = low + (((high - low) / (arr[high] - arr[low])) * (element - arr[low]));

      // Condition of target found
      if (arr[pos] == element) return pos;

      // If element is larger, element is in right sub array
      if (arr[pos] < element) return interpolationSearch(arr, pos + 1, high, element);

      // If element is smaller, element is in left sub array
      if (arr[pos] > element) return interpolationSearch(arr, low, pos - 1, element);
    }
    return -1;
  }
}
