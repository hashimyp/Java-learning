import java.util.*;
public class Transpose_Arrays {
  public static void main(String[] args) {
 System.out.println("Enter no of rows and columns m and n and then enter the matrix");
Scanner sc = new Scanner(System.in);
 int m = sc.nextInt();
int n = sc.nextInt();
int t[][] = new int[m][n];
  
int i, j;
 //input and storing
 for (i = 0; i <m;i++) {
for (j = 0;j<n;j++) {
t[i][j] = sc.nextInt();  //take data of one row and move down
}}
System.out.println();

//output  and transposing (row m becomes n and column n becomes m)
for (j =0;j<n;j++) {
for (i =0;i<m;i++) {
System.out.println(t[i][j] +  " ");
}}
System.out.println();
sc.close();
return;
}
}