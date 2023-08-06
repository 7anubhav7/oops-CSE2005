package WEEK14; //22BCE9109
class WEEK14a {
	    public static void main (String[] args) {
	        WEEK14 <Integer, Integer> obj1 =new WEEK14<Integer, Integer>(10, 15);
	        obj1.print();
	        WEEK14 <Double, Integer> obj2 =new WEEK14<Double, Integer>(10.6, 15);
	        obj2.print();
	        WEEK14 <Float, String> obj3 =new WEEK14<Float, String>(10.6f, "hello");
	        obj3.print();
	        WEEK14 <Character, String> obj4 =new WEEK14<Character, String>('C', "hello");
	        obj4.print();
	        System.out.println("22BCE9109");
	    }}