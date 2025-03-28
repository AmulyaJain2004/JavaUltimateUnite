class Arithmeticexception {
    public static void main (String args[]) {
        int a=50; 
        int b=0; 
        int c=a/b;
        System.out.println("result:"+c);
        System.out.println("rest of the code...");
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at testexception.main(testexception.java:5)
    }
}
