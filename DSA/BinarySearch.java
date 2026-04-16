import java.util.Scanner;

public class BinarySearch {

  // print function
  public static void print(int a[]) {
    for (int i = 0; i < a.length; i++)
      System.out.println(a[i]);
  }

  // sort function (Bubble Sort type)
  public static void sort(int a[]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }

      }
    }
  }

  // Binary Search function
  public static int search(int a[], int k) {
    int low = 0;
    int high = a.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (a[mid] == k) {
        return mid;
      } else if (a[mid] < k) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.println("Enter 5 array numbers:");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter element to search:");
    int key = sc.nextInt();

    System.out.println("The array elements Before Sorting is:");

    // function call
    print(arr);

    // function call
    sort(arr);

    System.out.println("The array After Sorting is:");
    // function call
    print(arr);

    // function call
    int result = search(arr, key);

    if (result != -1) {
      System.out.println("Found at position " + (result + 1));
    } else {
      System.out.println("Element  not  Found");
    }

    sc.close();

  }

}
