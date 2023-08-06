package programme2;
public class Cube extends Thread{
	int x;
	Cube(int n){
		x=n;
	}
public void run() {
	int cu=x*x*x;
	System.out.println("Cube of "+x+" = "+cu);
}
}
