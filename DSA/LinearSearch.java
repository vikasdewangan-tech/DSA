import java.util.Scanner;

public class LinearSearch {

  public static int search(int a[], int k){
    for(int i=0; i<a.length; i++){
      if(a[i]==k){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int i;
    System.out.println("Enter array 5 numbers:");
    for (i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The element in array are:");
    for(i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
    System.out.println("Enter element to search:");
    int key=sc.nextInt();

    int result=search(arr, key);
    if(result>=0)
      System.out.println("The element " +key+ " found at position "+ (result+1));
    else
      System.out.println("\nThe search element is not found in the array.");

    sc.close();
  }

}
