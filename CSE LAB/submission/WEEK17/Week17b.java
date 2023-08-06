package WEEK17; //22BCE9109
import java.util.Scanner;
public class Week17b {
	public void produce() throws InterruptedException {
		synchronized(this) {
			System.out.println("producer thread running");
			wait();
			System.out.println("Resumed");
		}}
	public void consume() throws InterruptedException {
		Thread.sleep(1000);
		Scanner sc=new Scanner(System.in);
		synchronized(this) {
			System.out.println("waiting for return key");
			sc.nextLine();
			System.out.println("Return key pressed");
			notify();
			Thread.sleep(2000);
			sc.close();
		}}}