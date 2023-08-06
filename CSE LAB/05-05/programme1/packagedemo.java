package programme1;
public class packagedemo {
	public static void main(String[] args) {
		arithematic a=new arithematic();
		int su=a.sum(10,20);
		System.out.println("sum= "+su);
		int sb=a.sub(10, 20);
		System.out.println("sub= "+sb);
		int mu=a.mul(10,20);
		System.out.println("mul= "+mu);
		int di=a.div(10,20);
		System.out.println("div= "+di);
		int mo=a.mod(10,20);
		System.out.println("mod= "+mo);
	}}