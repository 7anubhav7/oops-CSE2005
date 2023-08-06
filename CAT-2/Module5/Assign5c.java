package Module5; //22BCE9109
class Assign5c extends Thread{    
	Assign5a t;    
	Assign5c(Assign5a t){    
		this.t=t;    
	}    
	public void run(){    
		t.printTable(100);    
	}}   