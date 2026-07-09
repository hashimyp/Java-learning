
import java.util.Scanner;

public class factorial {
    public static void fact(int n)
    {
        if (n < 0) {                                                       //functions should be called before main method
            System.out.println("Please enter a positive integer.");     //if should be inside function and not outside

            return;    //exit fn
        } 
       
        int result = 1; 
        for (int i = n; i >= 1; i--) {   //F(n) = n * F(n-1)(=(i>=1))  //F(5) = 5 * F(4) = 5 * 4 * F(3) = 5 * 4 * 3 * F(2) = 5 * 4 * 3 * 2 * F(1) = 5 * 4 * 3 * 2 * 1
            result *= i;   //=return = return x i
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        
        sc.close();  //close scanner
    }
}

