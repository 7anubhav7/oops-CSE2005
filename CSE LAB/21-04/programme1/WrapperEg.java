package programme1;
public class WrapperEg {
	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);
		Integer j=i;
		System.out.println(a+" "+i+" "+j);
	}}