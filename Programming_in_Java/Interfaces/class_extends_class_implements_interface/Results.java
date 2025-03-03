class Teacher { 
    int marks; 
    void setMark(int m) { 
        marks=m; 
    } 
    void getMark() { 
        System.out.println("marks are:"+marks); 
    } 
} 

interface Hod {  
    int total=200; 
    void putSign(); 
}

class Results extends Teacher implements Hod { 
    public void putSign() { 
        System.out.println("marks verified and put sign and forward"); 
    } 
    void display() { 
        System.out.println("Out of ="+total); 
    } 
    public static void main(String args[]) { 
        Results r=new Results(); 
        r.setMark(175); 
        r.getMark(); 
        r.display(); 
        r.putSign(); 
    } 
} 