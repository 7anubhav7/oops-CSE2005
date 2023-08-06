public class A1q1b extends A1q1a {
	int a,b,c,d; double cgpa;
	public A1q1b(int a, int b, int c, int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public double getCGPA() {
		cgpa=(a+b+c+d)/4;
		return cgpa;
			}}