package WEEK3; //22BCE9109
import java.util.*;
public class WEEK3Main {
	public static void main(String[] args) {
		WEEK3a obj=new WEEK3a();
		int i1,i2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer values");
		i1=sc.nextInt();
		i2=sc.nextInt();
		obj.display(i1, i2);
		double d1,d2;
		System.out.println("Enter the double values");
		d1=sc.nextDouble();
		d2=sc.nextDouble();
		obj.display(d1, d2);
		obj.display(i1, i2);
	}}