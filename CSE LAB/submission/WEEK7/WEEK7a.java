package WEEK7; //22BCE9109
import java.util.Scanner;
public class WEEK7a {
	private int rollno;
	private String name;
	Scanner sc=new Scanner(System.in);
	public void getrollno() {
		try {
			System.out.println("Enter rollno: ");
			rollno=sc.nextInt();
			System.out.println("Enter name: ");
			name=sc.nextLine();
			}
		catch(Exception e) {}
			}
	void putrollno() {
		System.out.println("Roll no ="+rollno);
		System.out.println("Name ="+name);
	}}