package WEEK12;
class WEEK12 { //22BCE9109
   public static void main(String args[]) {
  try {
       throw new MyException(2);
       // throw is used to create a new exception and throw it.
    }
   catch(MyException e)
   {
    System.out.println(e) ;}
   }}
class MyException extends Exception {
   int a;
   MyException(int b) {
     a=b;
   }
   public String toString() {
     return ("Exception Number =  "+a) ;
  } {System.out.println("22BCE9109");}}