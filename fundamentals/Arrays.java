import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5]; // declare an array of integers with size 5
        System.out.println("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++) { // loop through the array elements
            System.out.print(arr[i] + " "); // print each element followed by a space
        }
        sc.close();
    }
}