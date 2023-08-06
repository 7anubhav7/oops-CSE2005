package WEEK4;	//22BCE9109
public class WEEK4Main {
	public static void main(String args[])
	{
	WEEK4a[] obj=new WEEK4a[5];
	obj[0]=new WEEK4a(23907,"Dell Laptop");
	obj[1]=new WEEK4a(91240, "HP 630");
	obj[2]=new WEEK4a(29823,"LG OLED TV");
	obj[3]=new WEEK4a(11908,"MI Note Pro Max 9");
	obj[4]=new WEEK4a(43590,"Kingston USB");
	System.out.println("Product Object 0:"); obj[0].display();
	System.out.println("Product Object 1:"); obj[1].display();
	System.out.println("Product Object 2:"); obj[2].display();
	System.out.println("Product Object 3:"); obj[3].display();
	System.out.println("Product Object 4:"); obj[4].display();
	}}