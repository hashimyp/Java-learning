import java.util.Scanner;
public class Num_Power {



public static void main(String[] args) {
    if (args.length != 2) {
        System.out.println("Please provide exactly two arguments: base and exponent.");
        return;
    }
    int x = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    int power = (int) Math.pow(x, n); // Calculate x raised to the power of n
    System.out.println(x + " raised to the power of " + n + " is: " + power);
    sc.close();





}
} 