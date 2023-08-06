package WEEK16; //22BCE9109
public class Week16b extends Thread{
	Week16a t=new Week16a();
	int num;
	Week16b(Week16a t,int num){
		this.t=t;
		this.num=num;
	}
	public void run() {
		t.printTable(num);
	}}