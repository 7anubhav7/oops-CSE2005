package WEEK7; //22BCE9109	
public class WEEK7b extends WEEK7a{
	protected int m1,m2,m3;
	void getmarks() {
		try
		{	System.out.println("Enter marks: ");
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
		}
		catch(Exception e) {}
		}
	void putmarks() {
		System.out.println("m1 = "+m1);
		System.out.println("m2 = "+m2);
		System.out.println("m3 = "+m3);
	}}