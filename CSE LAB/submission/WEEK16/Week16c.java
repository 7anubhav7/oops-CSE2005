package WEEK16; //22BCE9109
public class Week16c extends Thread{
	Week16a t=new Week16a();
	int num;
	Week16c(Week16a t,int num){
		this.t=t;
		this.num=num;
	}
	public void run() {
		System.out.println(num);
	}}