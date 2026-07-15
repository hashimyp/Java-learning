import java.util.*;

public class TwoDArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the 2D array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        // declare a 2d array
        int[][] data = new int[rows][cols]; // rows rows and cols columns
        // to use the 2d array we need to use nested for loop
        for (int i = 0; i < rows; i++) {// for loop for rows (store values)
            for (int j = 0; j < cols; j++) { // for loops with columns (store values)
                System.out.println("Enter the value for row " + i + " and column " + j + ":");
                data[i][j] = sc.nextInt();// store the value in the 2d array
            }
        }
           for (int i = 0; i < rows; i++) {// for loop for rows (print)
            for (int j = 0; j < cols; j++) { // for loops with columns (print)
                System.out.print(data[i][j] + " ");
            }
            System.out.println(); // print a new line after each row
        
        sc.close();
    }
}
}
