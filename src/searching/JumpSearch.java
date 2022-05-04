package searching;

public class JumpSearch {
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 50, 60, 80, 100, 120, 130, 170};
    int element = 170;

    System.out.println("Element found at position: " + jumpSearchFunc(arr, element));
  }

  private static int jumpSearchFunc(int[] arr, int element) {
    if (arr[0] == element) {
      return 0;
    }

    int start = 0;

    int n = (int) Math.sqrt(arr.length);

    //Identify the bound range of the element
    while (n < arr.length && arr[n] <= element) {
      start = n;
      n += Math.min((int) Math.sqrt(arr.length), arr.length);
    }

    // Do a linear search to determine the position
    while (start < n) {
      if (arr[start] == element) {
        return start;
      }
      start++;
    }
    return -1;
  }
}

/*Time Complexity : O(√n)
Auxiliary Space : O(1)

Important points:
Works only sorted arrays.
The optimal size of a block to be jumped is (√ n). This makes the time complexity of Jump Search O(√ n).
The time complexity of Jump Search is between Linear Search ( ( O(n) ) and Binary Search ( O (Log n) ).
Binary Search is better than Jump Search,
but Jump search has an advantage that we traverse back only once (Binary Search may require up to O(Log n) jumps,
consider a situation where the element to be searched is the smallest element or just bigger than the smallest).
 So in a system where binary search is costly, we use Jump Search.*/
