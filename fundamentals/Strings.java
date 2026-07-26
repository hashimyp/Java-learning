public class Strings {
public static void main(String args[]) {
    String str = "computeruser@gmail.com";
    System.out.println("String: " + str);
    System.out.println("Length of the string: " + str.length());
    System.out.println("Character at index 4: " + str.charAt(4));
    System.out.println("Substring from index 1 to 4: " + str.substring(0, 12));//add +1 to end index to include the character at that index
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Lowercase: " + str.toLowerCase());
    System.out.println("Index of 'World': " + str.indexOf("World"));
    System.out.println("Replace 'World' with 'Java': " + str.replaceAll("e", "i").replaceAll("E", "i"));
    System.out.println("Formatted string: " + String.format("Hello, %s!", "Java"));

}}
