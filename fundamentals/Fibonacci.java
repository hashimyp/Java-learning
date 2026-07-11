import java.util.Scanner;
public class Fibonacci {
    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
           
        }
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); /* the series is printed in the form of doublets and each 
                                          input (n) the user gives that many doublets are formed */
            System.out.print(b + " ");
           
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
