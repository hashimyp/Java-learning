
import java.util.*;
public class BitManupulation1 {
    public static void main(String[] args) {
        
        System.out.println("Enter two integers for bit manipulation operations:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Bitwise AND
        int andResult = a & b; 
        System.out.println("Bitwise AND of " + a + " and " + b + " is: " + andResult);

        // Bitwise OR
        int orResult = a | b; 
        System.out.println("Bitwise OR of " + a + " and " + b + " is: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; 
        System.out.println("Bitwise XOR of " + a + " and " + b + " is: " + xorResult);

        sc.close();
    }

}
