package WEEK8; //22BCE9109
import java.util.Scanner;
public class WEEK8c implements WEEK8a{
	Scanner sc=new Scanner(System.in);
	int length,area;
	public void dimensions() {
		System.out.println("Enter length :");
		length=sc.nextInt();
	}
	public void area() {
		area=length*length;
		System.out.println("Area of square: "+area);
		}}