import java.util.*;

public class BitManupulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer for bit manipulation operations:");
        int num = sc.nextInt();
        System.out.println("Enter the index of the bit to set (right to left)");
        int i = sc.nextInt();
        //SET Bit = OR = UPDATE THE SPECIFIED INDEX TO 1
        int bitmask = 1 << i;
        int newnum = bitmask | num;
        System.out.println("The new number is (SET) to " + newnum + "\n");
        //AND Bit
        newnum = bitmask & num;
        if (newnum == 0) {
            System.out.println(
                    "In accordance to the index and the number you have entered , the index correlates to zero ");
        } else {
            System.out.println("The new number is (AND) " + newnum + "\n");
        }
        //CLEAR Bit = NOT + AND = NAND = UPDATE THE SPECIFIED INDEX TO 0 

        int revbitmask = ~(bitmask);  //NOT
        newnum = revbitmask & num;    //AND
        System.out.println("The new number when clearing the bit at  specified index is : "+newnum+"\n");
sc.close();
    }
}
