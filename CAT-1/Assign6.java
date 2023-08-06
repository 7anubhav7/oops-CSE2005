public class Assign6 {
		 int height, weight; // Instance Variables
		 Assign6(int h, int w) {
		 this.height = h;
		 this.weight = w;
		 }
		 void run() {
		 System.out.println("Huff Puff");
		 }
		 void print() {
		 System.out.println("Now my weight is" + this.weight);
		 }
		 public static void main(String[] args) {
		 Assign6 A = new Assign6(170, 65); 
		 A.run();
		 A.print();
		 }}