import java.util.*;

public class BubbleSort {
   
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array to input that needs to be sorted \n");
        System.out.println("Enter the elements of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // Bubble sort algorithm
        for (int i = 0; i < size - 1; i++) {// count n-1 iterations
            for (int j = 0; j < size - i - 1; j++) {// make n-1 pairs since initialisation i is 0
                if (arr[j] > arr[j + 1]) {
                    /*
                     * swapping because to make the lighter elemet on left and heavier element on
                     * right
                     */
                    int swap = arr[j]; // a=b,b=c therefore,a=c
                    arr[j] = arr[j + 1];// taking j because it does the work of actually
                                        // making pairs to then later swap and i is just to make the pairing loop run
                                        // "n-1" times
                    arr[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
