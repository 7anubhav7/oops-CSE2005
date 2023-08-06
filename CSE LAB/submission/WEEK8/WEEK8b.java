package WEEK8; //22BCE9109
import java.util.Scanner;
public class WEEK8b implements WEEK8a {
	int length,breadth,area;
	public void dimensions() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		length=sc.nextInt();
		System.out.println("Enter breadth: ");
		breadth=sc.nextInt();
		sc.close();
	}
	public void area() {
		area=length*breadth;
		System.out.println("Area of rectangle: "+area);
	}}