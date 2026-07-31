import java.util.Scanner;

public class SelectionSort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array to input that needs to be sorted \n");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array");

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int i, j;
        // Selection sort algorithm
        for (i = 0; i < size - 1; i++) {//runs loop n-1 times takes  first index of array as smallest
            int smallest = i;          

            for (j = i + 1; j < size; j++) { // goes to second index (i+1) and checks if it's smaller than previous assumed smallest = i
                if (arr[smallest] > arr[j]) { // if current smallest is greater than arr[j]
                    smallest = j; // assume j is now the smaller index
                }
            }
            int swap = arr[smallest]; //now swap with temp var "swap" but only swap one time
            arr[smallest] = arr[i];   //per n-1 iterations
            arr[i] = swap;            //therefore, we use i instead of j since we are not constantly swapping every pairlike in bubble sort
        }
        
        System.out.println("Sorted array:");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
