package Module5; //22BCE9109
class Assign5b extends Thread{    
	Assign5a t;    
	Assign5b(Assign5a t) {    
		this.t=t;    
	}    
	public void run() {   
		t.printTable(5);    
	}}