import java.util.Scanner; // import the Scanner class to read input
public class Functions {
 public static void f1(String name) // argument is the input function require along with the datatype it can also be multiple inputs
//function come before the main function and can be called in the main function  
         {
            System.out.println("Hello, " + name + "!");
            return; // return statement is used to exit the function 
         } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object to read input
        System.out.print("Enter your name: "); // prompt the user to enter their name   
        String name = sc.nextLine(); // read the user's input
        f1(name); // call the function f1 with the user's name as an argument
        
    }
    
}
