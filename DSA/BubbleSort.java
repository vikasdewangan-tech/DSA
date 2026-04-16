import java.util.Scanner;
public class BubbleSort {

  public static void print(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
  }

  public static void sort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-1-i; j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }

  public static void main(String[] Args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("Enter 5 array numbers:");
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }

    System.out.println("The array Before Bubble Sorting:");
    print(arr);
    System.out.println("The array After Bubble sorting:");
    sort(arr);
    print(arr);

    sc.close();

  }

  
}
