package Module5; //22BCE9109
public class Assign1 extends Thread {
		  public static void main(String[] args) {
		    Assign1 t = new Assign1();
		    t.start();
		    System.out.println("This code is outside of the thread");
		  }
		  public void run() {
		    System.out.println("This code is running in a thread");
	}}