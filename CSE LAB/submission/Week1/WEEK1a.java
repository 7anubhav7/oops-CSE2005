package Week1;	//22BCE9109	
public class WEEK1a {
		double a;
		WEEK1a()
		{ 
		a=13.2;
		}

		WEEK1a(int b, int c)
		{
		double d=b/c;
		System.out.println("Division is :"+d);
		}

		WEEK1a(WEEK1a z)
		{
		double sum =z.a;
		System.out.println("copy constructor :"+sum);
		}}