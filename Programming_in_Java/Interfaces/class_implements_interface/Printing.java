interface printable{   
    void print();  //by default public and abstract 
}   
   
class Printing implements printable{   
    public void print(){//overridden method 
        System.out.println("Hello"); 
    }   
    
    public static void main(String args[]){   
        //printable obj = new printable ();              // gives error        
        Printing obj=new Printing();                     // works                    
        //printable obj = new Printing ();                     // dynamic method dispatch / runtime polymorphism also works                     
        obj.print();   
    }   
} 
