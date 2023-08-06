import java.util.Scanner;
class Assign22 {
 public static void main(String[] args) {
 Double n, sum = 0.0;
 Scanner sc=new Scanner(System.in);
 for (int i=1;i<6;++i) {
 System.out.print("Enter number "+i+" : ");
 n= sc.nextDouble();
 if (n <= 0.0) {
 continue;
 }
 sum+=n;
 }
 System.out.println("Sum = " + sum);
 sc.close();
 }}