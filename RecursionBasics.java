import java.util.*;

public class RecursionBasics {
    public static void printName(String name) {
        while (name.length() == 0) {
            System.out.println("Enter name:");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            sc.close();
        }
        System.out.println("Hello, " + name);
    }
public static boolean Fibonacci(int num) {
        if (num < 0) {
            System.out.println("Invalid input");
            return false;
        } else if (num == 0) {
            System.out.print("0 ");
            return true;
        } else if (num == 1) {
            System.out.print("0 1 ");
            return true;
        } else {
            int a = 0, b = 1, c;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < num; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            return true;
        }
        }
        
        public static void factorial(int FactorialNum) {
        if (FactorialNum < 0) {
            System.out.println("Invalid input");
           
        } else if (FactorialNum == 0) {
            System.out.println("Factorial of 0 is 1");
          
        } else {
            int fact = 1;
            for (int i = 1; i <= FactorialNum; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + FactorialNum + " is " + fact);
        
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        printName(name);
        System.out.println(name + ", enter a number to see its fibonacci series!");
        int num = sc.nextInt();
        Fibonacci(num); 
        System.out.println("and so on...");
        System.out.println("Now let us calculate Factorial of a number \nEnter a number to calculate its factorial!");
        int factorialNum = sc.nextInt();
        factorial(factorialNum);
        sc.close();  
    }

}
