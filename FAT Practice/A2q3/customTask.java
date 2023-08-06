package A2q3;
public class customTask extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread"+Thread.currentThread().getName()+"output: "+i);
			try {
				
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted by t5");
			}
		}
	}
}