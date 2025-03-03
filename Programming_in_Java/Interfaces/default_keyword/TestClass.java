// A simple Java program to TestClassnstrate static methods in Java 
interface TestInterface 
{ 
// abstract method 
public void square (int a); 
// static method 
static void show() 
{ 
System.out.println("Static Method Executed"); 
} 
} 
class TestClass implements TestInterface 
{ 
// Implementation of square abstract method 
public void square (int a) 
{ 
System.out.println(a*a); 
} 
public static void main(String args[]) 
{ 
TestClass d = new TestClass(); 
d.square(4); 
// Static method executed 
TestInterface.show(); 
} 
} 