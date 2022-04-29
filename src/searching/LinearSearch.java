package searching;

public class LinearSearch {
  public static void main(String[] args) {
    int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
    int element = 110;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        System.out.println("Element found at position:" + i + 1);
        break;
      }
    }
    System.out.println("Element not found");
  }
}

/*Notes - The time complexity of the above algorithm is O(n). Loop through the array and check for the element */