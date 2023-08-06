class Assign10
{
 static int count=0;
 public void increment()
 {
 count++;
 }
 public static void main(String args[])
 {
 Assign10 obj1=new Assign10();
 Assign10 obj2=new Assign10();
 obj1.increment();
 obj2.increment();
 System.out.println("Obj1: count is="+obj1.count);
 System.out.println("Obj2: count is="+obj2.count);
 }}