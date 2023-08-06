class Assign44 { //method overloading by changing 
 private static void display(int a){ //data type of
 System.out.println("Got Integer data."); //parameters
 }
 private static void display(String a){
 System.out.println("Got String object.");
 }
 public static void main(String[] args) {
 display(1);
 display("Hello");
 }}