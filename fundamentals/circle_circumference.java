import java.util.Scanner;

public class circle_circumference {

    public static float circ(float radius) {
        if (radius < 0) {
            System.out.println("Please enter a positive integer.");
            return (float) 0.0; // or 0.0f
        }    
        final float PI = 3.14f; // constant value of pi
        float circumference = 2 * PI * radius; // using the constant
        return circumference;
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle:");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float circumference = circ(radius); // calling the function
        System.out.println("Circumference of the circle is: " + circumference);

        sc.close();
    }
}
