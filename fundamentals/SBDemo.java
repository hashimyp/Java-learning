
public class SBDemo {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("This  is a string\n");
        System.out.println("Printed/Original string:\n" + sb + "\n"); // print the string
        System.out.println("Character at index 5:\n" + sb.charAt(5)+ "\n"); // print the character at index 5
        sb.setCharAt(4, 's'); // set the desired character at the specified index
        System.out.println("After setting character `s` at index 4: \n" + sb);
        System.out.println("After appending string: \n" + sb.append("and this is a string builder")+ "\n"); // append(add to)
                                                                                                     // the string
        System.out.println("After inserting string:\n" + sb.insert(0, "Hello,")+ "\n"); // insert the string at the specified
                                                                                  // index
        System.out.println("After deleting characters from index 0 to 5: \n" + sb.delete(0, 6)+ "\n"); // delete the characters                                                                                            
        System.out.println("Inserting ! to last index: \n" + sb.insert(sb.length(), "!")+ "\n"); // insert ! at the last index
        System.out.println("Reversed string: \n" + sb.reverse());
    }

}
