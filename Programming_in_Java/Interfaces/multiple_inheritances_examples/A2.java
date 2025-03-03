interface Printable{   
void print();   
}   
   
interface Showable{   
void print();   
}   
   
class A2 implements Printable,Showable{   
    
 public void print(){System.out.println("Hello");}  
 public static void main(String args[]){   
 A2 obj = new A2();   
 obj.print();   
  }   
 }  