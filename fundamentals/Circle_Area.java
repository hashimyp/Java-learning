import java.util.*;

public class Circle_Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        while (!sc.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next();
             // discard the bad token so it doesn't loop forever
        }
        float r = sc.nextFloat();
        while (r < 0) {
            System.out.println("Radius cannot be negative. Please enter a valid radius.");
            sc.next(); // discard the bad token so it doesn't loop forever
            sc.close();
            
        }

        float area = (float) (Math.PI * Math.pow(r, 2));
        System.out.println("The area of the circle is: " + area);
        sc.close();
        return;
    }
}
