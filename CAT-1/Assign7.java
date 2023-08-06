import java.io.*;
class Assign7 {
static int studentCount; //static variable
Assign7() {
studentCount=15;
}
void addStudent() {
studentCount++;
}
public static void main(String[] args) throws IOException {
Assign7 java=new Assign7();
Assign7 python=new Assign7();
java.addStudent();
python.addStudent();
System.out.println("Total Students " + studentCount);
}}