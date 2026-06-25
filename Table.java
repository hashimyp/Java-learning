
      
public static void main(String args[]) {
    System.out.println("Enter a number:Make a TABLE of that number!");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    for (int j = 1; j <= 10; j++) {
        int k = i * j;
        System.out.println(i + " * " + j + " = " + k);
    }




}
