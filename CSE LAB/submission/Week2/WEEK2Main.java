package Week2;	//22BCE9109
public class WEEK2Main {
	public static void main(String args[])
	{
	WEEK2a[] obj=new WEEK2a[5];
	obj[0]=new WEEK2a(89,"Ramesh");
	obj[1]=new WEEK2a(98,"Dheeraj");
	obj[2]=new WEEK2a(70,"Honey");
	obj[3]=new WEEK2a(85,"David");
	obj[4]=new WEEK2a(67,"Bhaanu");
	System.out.println("Student 1 Info:-"); obj[0].display();
	System.out.println("Student 2 Info:-"); obj[1].display();
	System.out.println("Student 3 Info:-"); obj[2].display();
	System.out.println("Student 4 Info:-"); obj[3].display();
	System.out.println("Student 5 Info:-"); obj[4].display();
	}}