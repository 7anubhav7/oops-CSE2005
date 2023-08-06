package programme2;
import java.util.Random;
public class Rnumber extends Thread {
	public void run() {
		Random r=new Random();
		for(int i=0;i<5;i++) {
			int n=r.nextInt();
			System.out.println("Random Integer Generated:"+n);
			Square s=new Square(n);
			s.start();
			Cube c=new Cube(n);
			c.start();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}}}}