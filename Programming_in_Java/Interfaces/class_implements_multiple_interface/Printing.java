interface Printable{   
    void print();   
}   
   
interface Showable{   
    void show();   
}   
   
class Printing implements Printable,Showable{   

    public void print(){
        System.out.println("Hello");
    }   
    public void show(){
        System.out.println("Welcome");
    }   
    public static void main(String args[]){   
    Printing obj = new Printing();   
    obj.print();   
    obj.show();   
    }   
}   