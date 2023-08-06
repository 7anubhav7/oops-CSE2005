package Module4; //22BCE9109
public class Assign28 {
	String obj;
	<T extends Object>Assign28(String obj){
		this.obj=obj;}
	void displayClassName() {
		System.out.println("Name of class: "+obj.getClass().getName());
	}
	public class Generic{
		public static void main(String args[]) {
			Assign28 obj=new Assign28("Merry");
			Assign28 obj1=new Assign28("Christmas");
			obj.displayClassName();
			obj1.displayClassName();
		}}}