package WEEK16; //22BCE9109
import java.util.Scanner;
public class Week16d {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter any two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		Week16a t=new Week16a();
		Week16b t1=new Week16b(t,n1);
		Week16c t2=new Week16c(t,n2);
		t1.start();
		t2.start();
		sc.close();
	}}