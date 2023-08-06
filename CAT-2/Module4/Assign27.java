package Module4; //22BCE9109
public class Assign27 {
	public static<T> void display(T[] array) {
		for(T t:array) {
			System.out.print(t+" ");}
		System.out.println();
		}
	public static void main(String args[]) {
		Integer[] arr1= {20,30,40,50,60,70};
		System.out.println("Printing integer objects:-");
		Assign27.display(arr1);
		Double[] arr2= {20.20,30.30,40.40};
		System.out.println("Printing double objects:-");
		Assign27.display(arr2);
		String[] arr3= {"Orange","Lemon","Grape"};
		System.out.println("Printing string objects:-");
		Assign27.display(arr3);
	}}