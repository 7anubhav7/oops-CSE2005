package Module5; //22BCE9109
class Assign5a  { 
 void printTable(int n){    
   synchronized(this){    
     for(int i=1;i<=5;i++){    
      System.out.println(n*i);    
      try{    
       Thread.sleep(400);    
      }
      catch(Exception e){
    	  System.out.println(e);}    
      }}}}