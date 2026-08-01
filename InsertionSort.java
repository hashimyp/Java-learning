import java.util.*;
public class InsertionSort {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array to input that needs to be sorted \n");
     int size = sc.nextInt();
    System.out.println("Enter the elements of the array");
   

    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    // Insertion sort algorithm// 3,2,1  a-true,b-key=2 c-j=0,d-arr[j]=3 (0th ind), TRUE,e-=2=3 execute by j--
    for (int i = 1; i < size; i++) { //a-unsorted array loop from 1 -> size
      int key = arr[i];              //b-select the first index of an array as key and compare it with the elements of the sorted array
      int j = i - 1;                 //d-select the 0th index and compare it with the key
      while (j >= 0 && arr[j] > key) {//e-decision making loop to check if the key is smaller than the elements of the sorted array
        arr[j + 1] = arr[j];          //c-if the key is smaller than the elements of the sorted array, shift the elements to the right
        j--;
      }
      arr[j + 1] = key;               //once desision is completed, place the key in the correct position
    }//NOTE- IN EXAMPLE, 3 IS SORTED ARRAY AND 2 IS KEY AND 1 IS UNSORTED ARRAY, SO WE COMPARE KEY WITH SORTED ARRAY AND PLACE IT IN THE CORRECT POSITION

    System.out.println("Sorted array:");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    
  }
}
