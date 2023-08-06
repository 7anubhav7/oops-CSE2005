package programme2;
import java.util.Random;
public class Square extends Thread{
	int x;
	Square(int n){
		x=n;
	}
public void run() {
	int sq=x*x;
	System.out.println("Square of"+x+"="+sq);
}}