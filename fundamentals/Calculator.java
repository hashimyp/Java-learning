
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
 System.out.println("Fast Calculator for two numbers");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
int j = sc.nextInt();

    System.out.println("Enter the operation you want to perform: +, -, *, /");
    char op = sc.next().charAt(0);
    int result; 
    switch (op) {
        case '+':
            result = i + j;
            System.out.println(i + " + " + j + " = " + result);
            break;
        case '-':
            result = i - j;
            System.out.println(i + " - " + j + " = " + result);
            break;
        case '*':
            result = i * j;
            System.out.println(i + " * " + j + " = " + result);
            break;
        case '/':
            if (j != 0) {
                result = i / j;
                System.out.println(i + " / " + j + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
            case '%':
            if (j != 0) {
                result = i % j;
                System.out.println(i + " % " + j + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }   
        default:
            System.out.println("Invalid operation!");
            break;
    }
  sc.close();
}
}
