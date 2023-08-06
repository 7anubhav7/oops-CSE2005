package WEEK10; //22BCE9109
public class WEEK10a implements Runnable {
	public void run() {
		System.out.println("Thread has ended");
	}
	public static void main(String args[]) {
		WEEK10a obj=new WEEK10a();
		Thread t1=new Thread(obj);
		t1.start();
		System.out.println("Hi");
	}}